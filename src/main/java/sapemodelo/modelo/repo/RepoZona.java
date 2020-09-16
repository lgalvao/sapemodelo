package sapemodelo.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sapemodelo.modelo.Zona;

@Repository
public interface RepoZona extends JpaRepository<Zona, String> {
}
