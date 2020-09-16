package sapemodelo.modelo;

import lombok.Data;
import lombok.experimental.Accessors;
import sapemodelo.modelo.enums.SituacaoVerificacao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "VW_SAPE_VERIFICACAO_ETAPA", schema = "ADMSUPRE2TESTE")
@Data
@Accessors(chain = true)
public class VerificacaoEtapa {
    @Id
    @Column(name = "COD_OBJETO")
    String id;

    @ManyToOne
    @JoinColumn(name = "COD_OBJETO_PLEITO", referencedColumnName = "COD_OBJETO")
    Pleito pleito;

    @ManyToOne
    @JoinColumn(name = "COD_OBJETO_ETAPA", referencedColumnName = "COD_OBJETO")
    Etapa etapa;

    @Column(name = "SIT_VERIFICACAO")
    @Enumerated(EnumType.STRING)
    SituacaoVerificacao situacaoVerificacao;

    @OneToMany(mappedBy = "verificacaoEtapa")
    List<VerificacaoZona> verificacoesZona;

    @OneToMany(mappedBy = "verificacaoEtapa")
    List<VerificacaoMunicipio> verificacoesMunicipio;

    @OneToMany(mappedBy = "verificacaoEtapa")
    List<VerificacaoPolo> verificacoesPolo;
}
