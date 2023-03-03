package Mercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private Cliente cliente;
    private List<ItemDeCompra> itens;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        itens = new ArrayList<>();
    }

    public void adicionar(Produto prod, int qtd) {
        itens.add(new ItemDeCompra(prod, qtd));

    }

    public void remover(Produto prod, int quantidadeParaRemover) {
        if (quantidadeParaRemover <= 0) {
            System.out.println("Quantidade para remover precisa ser maior que zero");
        }
        ItemDeCompra itemDeCompra = buscaItem(prod);
        if (itens.contains(itemDeCompra)) {
            if (quantidadeParaRemover >= itemDeCompra.getQuantidade()) {
                eliminar(prod);
                System.out.println("Você retirou mais ou o que possuia no carrinho, o produto " + prod.getNome() + " será eliminado");
            }
            itemDeCompra.setQuantidade(itemDeCompra.getQuantidade() - quantidadeParaRemover);

        }
    }

    public void eliminar(Produto prod) {
        ItemDeCompra itemDeCompra = buscaItem(prod);
        if (itemDeCompra != null) {
            itens.remove(itemDeCompra);
        }
    }

    public double calcularTotal() {
        double preco = 0;
        for (ItemDeCompra item : itens) {
            preco += item.getQuantidade() * item.getProduto().getPreco();
        }
        return preco;
    }

    public ItemDeCompra buscaItem(Produto prod) {
        for (ItemDeCompra item : itens) {
            Produto produto = item.getProduto();
            if (produto.equals(prod)) {
                return item;
            }
        }
        return null;
    }

    public List<ItemDeCompra> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        return "Carrinho{" + " cliente = " + cliente + ", itens = " + itens + '}';
    }

}
