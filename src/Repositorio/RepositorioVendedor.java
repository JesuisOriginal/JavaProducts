package Repositorio;

import Main.Model.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class RepositorioVendedor {
    public List<Vendedor> listaVendedor = new ArrayList <>();


    public void salvaVendedor(Vendedor cliente) {
        listaVendedor.add(cliente);
    }

    public List<Vendedor> retornaListaVendedor(){
        return listaVendedor;
    }
}
