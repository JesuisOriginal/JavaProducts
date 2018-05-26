package Controller;

import Main.Model.Cliente;
import Main.Model.Produto;
import Main.Model.Venda;
import Main.Model.Vendedor;

import java.util.Scanner;

class FunctionController {

    public void functionMenu() { //vai ser chamado em Controller.App
        Scanner in = new Scanner(System.in);

        Cliente clienteNovo = new Cliente();


        Vendedor vendedorNovo = new Vendedor();

        Produto produtoNovo = new Produto();

        Venda formentarCapitalismo = new Venda();

        String caso = in.next();
        switch (caso){
            default:{
                throw new  UnsupportedOperationException();
            }

            case "Cadastrar Cliente":{
                String[] metodo = {"setNome","setNiver","setEmail","setEndereco","setTelefone","setCpf","setLimiteCrediro"};
                for (String funcao : metodo) {
                    clienteNovo.criaCliente(funcao);
                }
                break;

            }

            case "Listar RepositorioClientes":{
                clienteNovo.RetornaRepositotioCliente();
                break;
            }

            case "Cadastrar Vendedor":{
                String[] metodo = {"setNome","setNiver","setEmail","setEndereco","setTelefone","setCpf","setMatricula","setDataContratacao"};
                for (String funcao : metodo) {
                    vendedorNovo.criaVendedor(funcao);
                }
                break;

            }

            case "Listar Vendedores":{
                vendedorNovo.RetornaRepositotioVendedor();
            }

            case "Cadastrar Produto":{
                String[] metodo = {"setNome","setPeso","setEstoqueMinimo","setEstoqueAtual","setPreco"};
                for (String funcao : metodo) {
                    produtoNovo.criaProduto(funcao);
                }
                break;
            }

            case "Listar Produtos":{
                produtoNovo.RetornaRepositotioProduto();
                break;
            }

            case "Registrar Venda":{
                String[] metodo = {"produto","vendedor","quantidade","cliente","dataVenda"};
                for (String funcao : metodo) {
                    formentarCapitalismo.vender(funcao);
                }
                break;
            }

            case "Relatorio de Vendas":{
                formentarCapitalismo.RetornaRepositotioVendas();
                break;
            }

        }
    }
}
