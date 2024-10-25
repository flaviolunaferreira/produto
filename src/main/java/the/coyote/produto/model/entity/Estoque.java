package the.coyote.produto.model.entity;

import java.time.LocalDate;

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
public class Estoque extends BasicEntity {

    private Integer quantidade;
    private String tipoMovimento; // "entrada" ou "saida"
    private String lote;
    private LocalDate dataValidade;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

}
