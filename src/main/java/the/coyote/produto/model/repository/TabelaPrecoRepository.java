package the.coyote.produto.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import the.coyote.produto.model.entity.TabelaPreco;

public interface TabelaPrecoRepository extends JpaRepository<TabelaPreco, Long> {

}
