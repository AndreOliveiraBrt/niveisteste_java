package lojinha.services;

import lojinha.dto.ProdutoDto;
import lojinha.entity.Produto;
import lojinha.repository.ProdutoRepository;

public class ProdutoService {

    public ProdutoDto buscarProduto(ProdutoRepository produtoRepository, int produtoId) throws Exception {
        ProdutoDto produtoDto = new ProdutoDto();

        Produto produto = produtoRepository.buscarProdutoNoBanco(produtoId);
        if(produto==null){
            throw  new Exception("");
        }
        produtoDto.setProdutoId(produto.getProdutoId());
        produtoDto.setProdutoNome(produto.getProdutoNome());
        produtoDto.setProdutoPreco(produto.getProdutoPreco());

        return produtoDto;
    }

}
