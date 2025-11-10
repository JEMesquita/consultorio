package br.com.consultorio.repository;

import br.com.consultorio.model.DocumentoMedico;
import br.com.consultorio.model.Paciente;
import br.com.consultorio.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DocumentoMedicoRepository extends JpaRepository<DocumentoMedico, Long> {
    List<DocumentoMedico> findByPacienteId(Long pacienteId);
    List<DocumentoMedico> findByMedicoId(Long medicoId);
    List<DocumentoMedico> findByTipo(String tipo);
}