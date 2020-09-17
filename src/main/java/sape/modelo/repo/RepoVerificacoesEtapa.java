package sape.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sape.modelo.Etapa;
import sape.modelo.Pleito;
import sape.modelo.TipoPendencia;
import sape.modelo.VerificacaoEtapa;
import sape.modelo.enums.SituacaoVerificacao;

import java.util.List;

@Repository
public interface RepoVerificacoesEtapa extends JpaRepository<VerificacaoEtapa, String> {
    @Query("select tpe.tipoPendencia from TipoPendenciaEtapa tpe where tpe.pleito = :pleito and tpe.etapa=:etapa")
    List<TipoPendencia> obterTiposPendencia(@Param("pleito") Pleito pleito, @Param("etapa") Etapa etapa);

    List<VerificacaoEtapa> findAllBySituacaoVerificacaoEquals(SituacaoVerificacao situacao);

}
