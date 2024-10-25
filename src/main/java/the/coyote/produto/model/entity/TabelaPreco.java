package the.coyote.produto.model.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TabelaPreco extends BasicEntity{

    private BigDecimal preco;
    private Integer quantidadeMinima;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

}
