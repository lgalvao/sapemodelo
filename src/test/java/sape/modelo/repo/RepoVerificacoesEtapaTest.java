package sape.modelo.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sape.modelo.Etapa;
import sape.modelo.Pleito;
import sape.modelo.VerificacaoEtapa;
import sape.modelo.enums.SituacaoVerificacao;

@SpringBootTest
class RepoVerificacoesEtapaTest {
    @Autowired
    RepoVerificacoesEtapa repoVerificacoesEtapa;

    @Autowired
    RepoEtapa repoEtapa;

    @Autowired
    RepoPleito repoPleito;

    @Test
    void obterTiposPendencias() {
        VerificacaoEtapa verificacaoEtapa = new VerificacaoEtapa();
        Etapa etapaGm = repoEtapa.findAll().get(1);
        Pleito pleitoAtual = repoPleito.findAllByAtualIsTrue().orElseThrow();
        repoVerificacoesEtapa.findAllBySituacaoVerificacaoEquals(SituacaoVerificacao.ATIVA);
    }


}