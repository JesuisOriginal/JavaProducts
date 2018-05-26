package Repositorio;
import Main.Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class RepositorioClientes {
    public List<Cliente> listaClientes = new ArrayList <>();

    public List <Cliente> getListaClientes() {
        return listaClientes;
    }

    public void salvaCLiente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public List<Cliente> retornaListaCliente(){
        return listaClientes;
    }

}
