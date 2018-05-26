package Controller;

import Main.Model.Cliente;
import Main.Model.Produto;
import Main.Model.Vendedor;
import Viewer.View;

import java.util.Calendar;

public class App {
    public static void main(String[] args) {

        //produto
        Produto pCarne = new Produto();
        pCarne.setNome("Carne");
        pCarne.estoqueAtual = 10;
        pCarne.estoqueMinimo = 5;
        pCarne.peso = 1;
        pCarne.preco = 2.5;

        //cliente
        Cliente cliente01 = new Cliente();
        cliente01.setNome("Goku");
        cliente01.setEmail("goku.son@capsule.org");
        cliente01.setCpf("758.984.645-44");
        cliente01.dataNiver.set(1980, Calendar.DECEMBER, 20);
        cliente01.setEndereco("Rua nome, 666");
        cliente01.setLimiteCredito(1000.00);
        cliente01.setTelefone("(81) 3333-22444");

        //Vendedor
        Vendedor vendedor01 = new Vendedor();
        vendedor01.setNome("maria");
        vendedor01.setEmail("not_a_suspicious_person@scam.com");
        vendedor01.setCpf("111.222.333.444-44");
        vendedor01.setEndereco("Rua nomeada, 042");
        vendedor01.setTelefone("(81) 3217-2244");
        vendedor01.dataNiver.set(1960,Calendar.DECEMBER,4);
        vendedor01.setMatricula("011222333");

        View Interface = new View();
        Interface.MainMenu();
        FunctionController Menu = new FunctionController();
        boolean rodaPrograma = true;
        ControllerInput input = new ControllerInput();
        do {
                Menu.functionMenu();
                Interface.ViewMenu("operar");
                if (input.input().equals("fechar")){
                    rodaPrograma = false;
                }

        }while (rodaPrograma);

        //System.out.println(cliente01);
    }
}
