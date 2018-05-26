package Main.Model;

import Controller.ControllerInput;
import Repositorio.RepositorioProdutos;
import Viewer.View;

import java.util.List;

public class Produto {
    private String nome;

    public double preco;

    public double peso;

    public int estoqueMinimo;

    public int estoqueAtual;


    private final RepositorioProdutos salva = new RepositorioProdutos();

    private final ControllerInput in = new ControllerInput();

    private final View mostrar = new View();

    private final Produto novoProduto = new Produto();

    public void criaProduto(String caso){

        String entrada;

        switch (caso){
            case "setNome":{
                mostrar.ViewMenu("nome");
                entrada = in.input();
                novoProduto.setNome(entrada);
                break;
            }

            case "setPeso":{
                mostrar.ViewMenu("peso");
                entrada = in.input();
                double peso = Double.parseDouble(entrada);
                novoProduto.setPeso(peso);
                break;
            }

            case "setEstoqueMinimo":{
                mostrar.ViewMenu("estoqueMinimo");
                entrada = in.input();
                int estoque = Integer.parseInt(entrada);
                novoProduto.setEstoqueMinimo(estoque);
                break;
            }

            case "setEstoqueAtual":{
                mostrar.ViewMenu("estoqueAtual");
                entrada = in.input();
                int estoque = Integer.parseInt(entrada);
                novoProduto.setEstoqueAtual(estoque);
                break;
            }

            case "setPreco":{
                mostrar.ViewMenu("preco");
                entrada = in.input();
                double preco = Double.parseDouble(entrada);
                novoProduto.setPreco(preco);
                break;
            }

        }
        salva.salvaProduto(novoProduto);
    }

    public void RetornaRepositotioProduto(){
        List<Produto> print;
        print = salva.retornaListaProdutos();
        mostrar.imprimeProduto(print);

    }

    public List<Produto> RetornaListaProduto(){
        List<Produto> print;
        print = salva.retornaListaProdutos();
        return print;
    }

    @Override
    public String toString(){
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco='" + preco + '\'' +
                ", peso=" + peso + '\'' +
                ", estoqueMinimo='" + estoqueMinimo + '\'' +
                ", estoqueAtual='" + estoqueAtual + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produto that = (Produto) o;

        return getNome().equals(that.getNome());
    }

    private void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    private void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }
}
