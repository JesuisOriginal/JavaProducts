package Main.Model;


import Controller.ControllerInput;
import ParsingMethods.StringToCalendar;
import Repositorio.RepositorioClientes;
import Repositorio.RepositorioProdutos;
import Repositorio.RepositorioVendas;
import Repositorio.RepositorioVendedor;
import Viewer.View;

import java.util.Calendar;
import java.util.List;

@SuppressWarnings("unused")
public class Venda {

    private Calendar dataVendas;

    private int quantidade;

    private Produto produto = new Produto();

    private Vendedor vendedor = new Vendedor();

    private Cliente cliente = new Cliente();


    private final ControllerInput in = new ControllerInput();

    private final Venda venda = new Venda();

    private final View mostrar = new View();

    private final StringToCalendar parseString = new StringToCalendar();

    private final RepositorioProdutos cardapio = new RepositorioProdutos();

    private final RepositorioVendedor testemunhaDoCaptalismo = new RepositorioVendedor();

    private final RepositorioClientes formentadoresCaptalista = new RepositorioClientes();

    private final RepositorioVendas salva = new RepositorioVendas();


    public void vender(String caso){

        String entrada;

        cardapio.listaProdutos = produto.RetornaListaProduto();

        testemunhaDoCaptalismo.listaVendedor = vendedor.RetornaListaVendedores();

        formentadoresCaptalista.listaClientes = cliente.RetornaListaClientes();

        switch (caso){
            case "produto":{
                mostrar.ViewMenu("produto");
                entrada = in.input();
                try {
                        for (Produto produtado: cardapio.listaProdutos ) {
                            if ( (produtado.getNome()).equals(entrada) ){
                                int indexOfProduto = cardapio.listaProdutos.indexOf(produtado);
                                venda.setProduto(cardapio.listaProdutos.get(indexOfProduto));
                                break;
                            }
                        }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            case "vendedor":{
                mostrar.ViewMenu("dataNiver");
                entrada = in.input();
                try {
                        for (Vendedor vendeiro:testemunhaDoCaptalismo.listaVendedor ) {
                            if (vendeiro.getNome().equals(entrada)){
                                int indexOfVendedor =testemunhaDoCaptalismo.listaVendedor.indexOf(vendeiro);
                                venda.setVendedor(testemunhaDoCaptalismo.listaVendedor.get(indexOfVendedor));
                                break;
                            }
                        }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

            case "quantidade":{
                mostrar.ViewMenu("quantidade");
                entrada = in.input();
                int quantidade = Integer.parseInt(entrada);
                venda.setQuantidade(quantidade);
                break;
            }

            case "cliente":{
                mostrar.ViewMenu("telefone");
                entrada = in.input();
                try {
                        for (Cliente clientelo: formentadoresCaptalista.listaClientes) {
                            if ( clientelo.getNome().equals(entrada) ){
                                int indexOfCliente = formentadoresCaptalista.listaClientes.indexOf(clientelo);
                                venda.setCliente(formentadoresCaptalista.listaClientes.get(indexOfCliente));
                                break;
                            }
                        }

                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            }

            case "dataVenda":{
                mostrar.ViewMenu("endereco");
                Calendar calCalabunga = parseString.stringToCalendar();
                venda.setDataVendas(calCalabunga);
                break;
            }

            case "venda":{
               try{
                   if ( venda.cliente.getLimiteCredito() > ( venda.produto.getPreco() * venda.getQuantidade() )   ){
                       mostrar.ViewMenu("venda");
                       mostrar.wait(1000);
                       cliente.setLimiteCredito( (cliente.getLimiteCredito() -venda.produto.getPreco() * venda.getQuantidade() )  );
                   }
               }catch (Exception e){
                   e.printStackTrace();
               }

            }

        }
        salva.salvaVendas(venda);

    }

    @SuppressWarnings("unused")
    public void RetornaRepositotioVendas(){
        List<Venda> print;
        print = salva.retornaListaVenda();
        mostrar.imprimeVendas(print);

    }

   /* public List<Venda> RetornaRelatioVendas(){
        List<Venda> lista;
        lista = salva.retornaListaVenda();
        return lista;
    }*/

    @Override
    public String toString(){
        return "Venda{" +
                "produto='" + produto +'\'' +
                ", vendedor='" + vendedor + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", cliente='" + cliente + '\'' +
                ", dataVenda='" + dataVendas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Venda venda = (Venda) o;

        if (getProduto() != venda.getProduto()) return false;
        if (getQuantidade() != venda.getQuantidade()) return false;
        if (getCliente() != venda.getCliente()) return false;
        if (getDataVendas() != venda.getDataVendas()) return false;
        return getVendedor().equals(venda.getVendedor());
    }

    @Override
    public int hashCode(){
        int result = getDataVendas().hashCode();
        result = 31 * result + getProduto().hashCode();
        result = 31 * result + getQuantidade();
        result = 31 * result + getCliente().hashCode();
        result = 31 * result + getVendedor().hashCode();
        return result;
    }



    public Produto getProduto() {
        return produto;
    }

    private void setProduto(Produto produto) {
        this.produto = produto;
    }

    private Vendedor getVendedor() {
        return vendedor;
    }

    private void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    private int getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private Calendar getDataVendas() {
        return dataVendas;
    }

    private void setDataVendas(Calendar dataVendas) {
        this.dataVendas = dataVendas;
    }
}
