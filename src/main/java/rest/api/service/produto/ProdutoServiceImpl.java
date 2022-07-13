package rest.api.service.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.api.model.Produto;
import rest.api.model.Usuario;
import rest.api.repository.produto.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements  ProdutoService{
    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public List<Produto> findAll() {return produtoRepository.findAll();}

    @Override
    public Optional<Produto> findById(long id) {return produtoRepository.findById(id);}

    @Override
    public Produto save(Produto produto) {
        try {
            return produtoRepository.save(produto);
        }catch (Exception e){
            throw new IllegalArgumentException("Fudeo", e);
        }
    }
    @Override
    public Produto create(Produto produto) {
        return produtoRepository.save(produto);
    }
}
