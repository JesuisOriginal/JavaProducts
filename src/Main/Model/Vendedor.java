package Main.Model;

import Controller.ControllerInput;
import ParsingMethods.StringToCalendar;
import Repositorio.RepositorioVendedor;
import Viewer.View;

import java.util.Calendar;
import java.util.List;

public class Vendedor extends PessoaFisica {

    private String matricula;

    private Calendar dataContratacao;

    private final RepositorioVendedor salva = new RepositorioVendedor();

    private final ControllerInput in = new ControllerInput();

    private final Vendedor vendedor = new Vendedor();

    private final View mostrar = new View();

    private final StringToCalendar parseString = new StringToCalendar();

    public void criaVendedor(String caso){

        String entrada;

        switch (caso){
            case "setNome":{
                mostrar.ViewMenu("nome");
                entrada = in.input();
                vendedor.setNome(entrada);
                break;
            }

            case "setNiver":{
                mostrar.ViewMenu("dataNiver");
                Calendar calendar = parseString.stringToCalendar();
                vendedor.setDataNiver(calendar);
                break;
            }

            case "setEmail":{
                mostrar.ViewMenu("email");
                entrada = in.input();
                vendedor.setEmail(entrada);
                break;
            }

            case "setTelefone":{
                mostrar.ViewMenu("telefone");
                entrada = in.input();
                vendedor.setTelefone(entrada);
                break;
            }

            case "setEndereco":{
                mostrar.ViewMenu("endereco");
                entrada = in.input();
                vendedor.setEndereco(entrada);
                break;
            }

            case "setCpf":{
                mostrar.ViewMenu("cpf");
                entrada = in.input();
                vendedor.setCpf(entrada);
                break;
            }

            case "setMatricula":{
                mostrar.ViewMenu("Matricula");
                entrada = in.input();
                vendedor.setMatricula(entrada);
                break;
            }

            case "setDataContratacao":{
                mostrar.ViewMenu("dataContratacao");
                Calendar calendar = parseString.stringToCalendar();
                vendedor.setDataContratacao(calendar);
                break;
            }

        }
        salva.salvaVendedor(vendedor);
    }

    public void RetornaRepositotioVendedor(){
        List<Vendedor> print;
        print = salva.retornaListaVendedor();
        mostrar.imprimeVendedor(print);

    }

    public List<Vendedor> RetornaListaVendedores(){
        List<Vendedor> lista;
        lista = salva.retornaListaVendedor();
        return lista;

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "matricula='" + matricula + '\'' +
                ", dataContratacao='" + dataContratacao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() ) return false;

        Vendedor vendedor = (Vendedor) o;

        if ( !getMatricula().equals(vendedor.getMatricula() )  ) return false;
        return getDataContratacao().equals(vendedor.getDataContratacao() );
    }



    private Calendar getDataContratacao() {

        return dataContratacao;
    }

    private void setDataContratacao(Calendar dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    private String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
