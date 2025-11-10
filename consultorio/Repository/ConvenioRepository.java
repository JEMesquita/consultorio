package br.com.consultorio.repository;

import br.com.consultorio.model.Convenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ConvenioRepository extends JpaRepository<Convenio, Long> {
    Optional<Convenio> findByCnpj(String cnpj);
    Optional<Convenio> findByNome(String nome);
}