package sape.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sape.modelo.Zona;

@Repository
public interface RepoZona extends JpaRepository<Zona, String> {
}
