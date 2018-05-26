package Repositorio;

import Main.Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProdutos {
    public List<Produto> listaProdutos = new ArrayList<>();

    public void salvaProduto(Produto produto) {
        listaProdutos.add(produto);
    }


    public List<Produto> retornaListaProdutos(){
        return listaProdutos;
    }
}
