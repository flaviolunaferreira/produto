package the.coyote.produto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import the.coyote.produto.model.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
