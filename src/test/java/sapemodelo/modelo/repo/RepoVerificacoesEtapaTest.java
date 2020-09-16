package sapemodelo.modelo.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sapemodelo.modelo.Etapa;
import sapemodelo.modelo.Pleito;
import sapemodelo.modelo.VerificacaoEtapa;
import sapemodelo.modelo.enums.SituacaoVerificacao;

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