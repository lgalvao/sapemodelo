package sape.modelo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Etapa {
    @Id
    @Column(name = "COD_OBJETO")
    String id;

    @Column(name = "DES_ETAPA")
    String descricao;
}
