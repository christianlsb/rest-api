package rest.api.service.produto;

import rest.api.model.Produto;
import rest.api.model.Usuario;

import java.util.List;
import java.util.Optional;


public interface ProdutoService {

   public List<Produto> findAll();
   public Optional<Produto> findById(long id);
   public Produto save(Produto produto);
   public Produto create(Produto produto);
}
