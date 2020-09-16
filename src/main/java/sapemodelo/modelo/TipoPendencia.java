package sapemodelo.modelo;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SAPE_TIPO_PENDENCIA", schema = "ADMSUPRE2TESTE")
@Data
@Immutable
public class TipoPendencia {
    @Id
    @Column(name = "COD_OBJETO")
    String id;

    @Column(name = "DES_PENDENCIA")
    String descricao;

    boolean exibirSupre;

    @Column(name = "SIT_BLOQUEIO")
    boolean situacaoBloqueio;
}
