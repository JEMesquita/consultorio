package br.com.consultorio.repository;

import br.com.consultorio.model.Agenda;
import br.com.consultorio.model.Medico;
import br.com.consultorio.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    List<Agenda> findByMedicoId(Long medicoId);
    List<Agenda> findByPacienteId(Long pacienteId);
    List<Agenda> findByMedicoAndDataHoraInicioBetween(Medico medico, LocalDateTime inicio, LocalDateTime fim);
    List<Agenda> findByDataHoraInicioBetween(LocalDateTime inicio, LocalDateTime fim);
    List<Agenda> findByPaciente(Paciente paciente);
}