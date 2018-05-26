package Main.Model;
import Controller.ControllerInput;
import ParsingMethods.StringToCalendar;
import Repositorio.RepositorioClientes;
import Viewer.View;

import java.util.Calendar;
import java.util.List;


public class Cliente extends PessoaFisica {
    private final View mostrar = new View();
    private double limiteCredito;

    private final RepositorioClientes salva = new RepositorioClientes();

    private final Cliente novoCliente = new Cliente();

    private final ControllerInput in = new ControllerInput();

    private final StringToCalendar parseString = new StringToCalendar();

    public void criaCliente(String caso){

        String input;



        switch (caso){
            case "setNome":{
                mostrar.ViewMenu("nome");
                input = in.input();
                novoCliente.setNome(input);
                break;
            }

            case "setNiver":{
                mostrar.ViewMenu("dataNiver");
                Calendar calendar = parseString.stringToCalendar();
                novoCliente.setDataNiver(calendar);
                break;
            }

            case "setEmail":{
                mostrar.ViewMenu("email");
                input = in.input();
                novoCliente.setEmail(input);
                break;
            }

            case "setTelefone":{
                mostrar.ViewMenu("telefone");
                input = in.input();
                novoCliente.setTelefone(input);
                break;
            }

            case "setEndereco":{
                mostrar.ViewMenu("endereco");
                input = in.input();
                novoCliente.setEndereco(input);
                break;
            }

            case "setCpf":{
                mostrar.ViewMenu("cpf");
                input = in.input();
                novoCliente.setCpf(input);
                break;
            }

            case "setLimiteCredito":{
                mostrar.ViewMenu("LimiteCredito");
                input = in.input();
                double credito = Double.parseDouble(input);
                novoCliente.setLimiteCredito(credito);
                break;
            }

        }
        salva.salvaCLiente(novoCliente);
    }

    public void RetornaRepositotioCliente(){
        List<Cliente> print;
       print = salva.retornaListaCliente();
       mostrar.imprimeCliente(print);

    }

    public List<Cliente> RetornaListaClientes(){
        List<Cliente> print;
        print = salva.getListaClientes();
        return print;
    }

    @Override
    public String toString() {
        return "Cliente{\n\t" +
                "super=" + super.toString() + ", \n\t" +
                "limiteCredito=" + limiteCredito +
                '}';
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
