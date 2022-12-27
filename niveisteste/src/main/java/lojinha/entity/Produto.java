package lojinha.entity;

public class Produto {


    private int produtoId;
    private String produtoNome;
    private String produtoPreco;

    public Produto(int produtoId, String produtoNome, String produtoPreco){
        this.produtoId=produtoId;
        this.produtoNome=produtoNome;
        this.produtoPreco=produtoPreco;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public String getProdutoPreco() {
        return produtoPreco;
    }

    public void setProdutoPreco(String produtoPreco) {
        this.produtoPreco = produtoPreco;
    }

}
