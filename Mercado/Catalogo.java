package Mercado;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private String titulo;
    private List<Produto> produtos;

    public Catalogo(String titulo, List<Produto> produtos) {
        this.titulo = titulo;
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        return new ArrayList<Produto>();
    }

}
