package sape.modelo.repo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class TesteReposBasicos {
    @Autowired
    RepoZona repoZona;

    @Autowired
    RepoMunicipio repoMunicipio;

    @Test
    void repoZonasNaoPodeEstarVazio() {
        assertThat(repoZona.findAll()).isNotEmpty();
    }

    @Test
    void repoMunicipiosNaoPodeEstarVazio() {
        assertThat(repoMunicipio.findAll()).isNotEmpty();
    }

    @Test
    void todaZonaDeveTerMunicipioSede() {
        repoZona.findAll().forEach(zona -> assertThat(zona.getMunicipioSede()).isNotNull());
    }

    @Test
    void todaZonaDeveTerMunicipiosAssociados() {
        repoZona.findAll().forEach(zona -> {
                    var municipios = zona.getMunicipios();
                    assertThat(zona.getMunicipios()).isNotEmpty();
                    System.out.printf("ZE%03d[%s] ", zona.getNumero(), municipios.size());
                }
        );
    }

    @Test
    void todoMunicipioDeveTerZonaAssociada() {
        repoMunicipio.findAll().forEach(municipio -> {
                    var zonas = municipio.getZonas();
                    assertThat(zonas).isNotEmpty();
                    System.out.printf("%s[%s] ", municipio.getNome(), zonas.size());
                }
        );
    }

    @Test
    void todoMunicipioDeveTerSecoesAsssociadas() {
        repoMunicipio.findAll().forEach(municipio -> {
                    var secoes = repoMunicipio.numerosSecoes(municipio);
                    assertThat(secoes).isNotEmpty();
                    System.out.printf("%s[%d] ", municipio.getNome(), secoes.size());
                }
        );
    }


}