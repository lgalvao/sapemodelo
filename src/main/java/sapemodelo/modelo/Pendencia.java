package sapemodelo.modelo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "SAPE_VER_ZONA_PENDENCIA", schema = "ADMSUPRE2TESTE")
@Data
public class Pendencia {
    @Id
    @Column(name = "COD_OBJETO")
    String id;

    @Lob
    String detalhamento;

    @ManyToOne
    @JoinColumn(name = "COD_OBJETO_TIPO_PENDENCIA", referencedColumnName = "COD_OBJETO")
    TipoPendencia tipoPendencia;
}
