package the.coyote.produto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import the.coyote.produto.model.entity.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}
