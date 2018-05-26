package Repositorio;

import Main.Model.Venda;

import java.util.ArrayList;
import java.util.List;

public class RepositorioVendas {
    private final List<Venda> relatorioVendas = new ArrayList<>();


    public void salvaVendas(Venda venda) {
        relatorioVendas.add(venda);
    }

    public List<Venda> retornaListaVenda(){
        return relatorioVendas;
    }
}
