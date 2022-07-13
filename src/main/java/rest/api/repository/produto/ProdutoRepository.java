package rest.api.repository.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import rest.api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
