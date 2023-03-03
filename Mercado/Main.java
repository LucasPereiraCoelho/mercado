package Mercado;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();
        Produto arroz = new Produto("Arroz", "Arroz Branco Tio João", 8.5, "AA3227BTCA");
        Produto bono = new Produto("Bolacha bono", "Biscoito recheado BONO", 3.5, "AA444TGABA");
        Produto mamao = new Produto("Mamão", "Mamão Papaya", 2.5, "AA78435AGH");
        Produto cebola = new Produto("Cebola", "Cebola Roxa", 2, "AAJHN6316");
        Produto carvao = new Produto("Carvão", "Carvão Bom de Brasa", 20, "AAGRT6423");
        Produto laranja = new Produto("Laranja", "Laranja Lima", 3, "AABTX546");

        listaProdutos.add(arroz);
        listaProdutos.add(bono);
        listaProdutos.add(mamao);
        listaProdutos.add(cebola);
        listaProdutos.add(carvao);
        listaProdutos.add(laranja);

        Catalogo imperatriz = new Catalogo("Supermercado Imperatriz", listaProdutos);

        Cliente lucas = new Cliente("Lucas", 11111111, "lucas123");
        Carrinho carrinho = new Carrinho(lucas);

        System.out.println(imperatriz.getProdutos());

        carrinho.adicionar(arroz, 2);
        carrinho.adicionar(bono, 1);
        carrinho.adicionar(mamao, 1);
        carrinho.remover(arroz, 1);
        carrinho.eliminar(mamao);

        System.out.println(carrinho.getItens());
        System.out.println("Total: R$" + carrinho.calcularTotal());

    }

}
