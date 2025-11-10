package br.com.consultorio.repository;

import br.com.consultorio.model.Faturamento;
import br.com.consultorio.model.Convenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface FaturamentoRepository extends JpaRepository<Faturamento, Long> {
    List<Faturamento> findByConvenioId(Long convenioId);
    List<Faturamento> findByPeriodoInicioBetween(LocalDate inicio, LocalDate fim);
    List<Faturamento> findByConvenio(Convenio convenio);
}