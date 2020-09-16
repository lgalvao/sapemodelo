package sapemodelo.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sapemodelo.modelo.Secao;

@Repository
public interface RepoSecao extends JpaRepository<Secao, String> {
}
