package br.com.consultorio.repository;

import br.com.consultorio.model.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica, Long> {
    Clinica findByCnpj(String cnpj);
}