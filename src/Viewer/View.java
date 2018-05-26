package Viewer;

import Main.Model.Cliente;
import Main.Model.Produto;
import Main.Model.Venda;
import Main.Model.Vendedor;

import java.util.List;

public class View {



    public void ViewMenu(String caso) {
        switch (caso){
            default:{
                throw new IllegalArgumentException();
            }

            case "nome":{
                System.out.println("informe a data de nascimento");
                break;

            }

            case "dataNiver":{
                System.out.println("informe a data do aniversario no formato");
                System.out.println("dd/mm/yyyy");
                break;
            }

            case "email":{
                System.out.println("informe o email");
                break;
            }

            case "endereco":{
                System.out.println("infomre o endereco");
                break;
            }

            case "telefone":{
                System.out.println("informe o telefone");
                break;
            }

            case "cpf":{
                System.out.println("informe o cpf");
            }

            case "limiteCredito":{
                System.out.println("informe o limite de credito");
            }

            case "Matricula":{
                System.out.println("informe a matricula");
            }

            case "dataContratacao":{
                System.out.println("informe a data de contratacao");
            }

            case "estoqueMinimo":{
                System.out.println("infome a quantidae do estoque minimo");
            }

            case "estoqueAtual":{
                System.out.println("informe a quantidade do estoqueAtual");
            }

            case "preco":{
                System.out.println("informe o valor do preco atual");
            }

            case "produto":{
                System.out.println("informe o produto que foi vendido");
            }

            case "vendedor":{
                System.out.println("informe o vendedor que vendeu");
            }

            case "quantidade":{
                System.out.println("informe a quantidade");
            }

            case "cliente":{
                System.out.println("informe o cliente que comprou");
            }

            case "dataVendas":{
                System.out.println("informe quando foi vendido");
            }

            case "venda":{
                System.out.println("Cliente possui credito suficiente para comprar");

            }

            case "operar":{
                System.out.println("deseja realizar outra operacao?");
                System.out.println("informe \"fechar\" para encerrar o programa");
            }

        }
    }



    public void imprimeCliente(List<Cliente> clientes ){
        int i=0;
        for (Cliente clientelo: clientes) {
            System.out.println(clientelo.getNome());
            i++;/*
            System.out.println(cliente.getNome());
            i++;
            */
        }
    }

    public void imprimeVendedor(List<Vendedor> vendedors ){
        int i=0;
        for (Vendedor vendeiro: vendedors) {
            System.out.println(vendeiro.getNome() );
            i++;
        }
    }

    public void imprimeProduto(List<Produto> produtos ){
        int i=0;
        for (Produto produteiro: produtos) {
            System.out.println(produteiro.getNome() );
            i++;
        }
    }

    public void imprimeVendas(List<Venda> vendas){
        int i=0;
        for (Venda vendido: vendas) {
            System.out.println( vendido.getProduto().getNome() );
            i++;
        }
    }


    public void MainMenu() {

        String[] opcoes ={"(1) Cadastrar Cliente", "(2) Listar RepositorioClientes", "(3) Cadastrar Vendedor","(4) Listar Vendedores", "(5) Cadastrar Produtos","(6) Listar Produtos","(7) Registrar Venda","(8) Relatorio de Vendas"};


        System.out.println("Menu de Interacao escolha o que deseja fazer");

        for (String escolha : opcoes ){
            System.out.println(escolha);
        }

    }
}
