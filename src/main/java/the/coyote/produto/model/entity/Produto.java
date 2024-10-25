package the.coyote.produto.model.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Produto extends BasicEntity {

    private String nome;
    private String descricao;
    private String categoria;
    private Boolean perecivel;
    
    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<TabelaPreco> precos = new ArrayList<>();

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<Estoque> estoque = new ArrayList<>();

}
