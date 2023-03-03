package Mercado;

public class ItemDeCompra {

    private Produto produto;
    private int quantidade;

    public ItemDeCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void setProduto(Produto prod) {
        this.produto = prod;
    }

    public void setQuantidade(int qtd) {
        this.quantidade = qtd;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return "{Carrinho = " + produto.getNome() + ", quantidade = " + quantidade + '}';
    }

}
