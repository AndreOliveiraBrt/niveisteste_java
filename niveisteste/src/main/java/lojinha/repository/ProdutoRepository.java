package lojinha.repository;

import lojinha.entity.Produto;

public class ProdutoRepository {

    public Produto buscarProdutoNoBanco(int produtoId)
    {
        Produto produto=null;
        if(produtoId==1)
        {
            produto=new Produto(1,"Andre","1.50");
        }

        return produto;

    }
}
