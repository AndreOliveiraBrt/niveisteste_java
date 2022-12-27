package lojinha.dto;

public class ProdutoDto {

    private  int produtoId;

    private  String produtoNome;

    private  String produtoPreco;

    public ProdutoDto(){
    }

    public  ProdutoDto(int produtoId, String produtoNome, String produtoPreco){
        this.produtoId=produtoId;
        this.produtoNome=produtoNome;
        this.produtoPreco=produtoPreco;
    }

    //getters
    public int getProdutoId() {
        return produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public String getProdutoPreco() {
        return produtoPreco;
    }

    //setters
    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public void setProdutoPreco(String produtoPreco) {
        this.produtoPreco = produtoPreco;
    }

}
