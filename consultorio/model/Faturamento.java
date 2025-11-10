package br.com.consultorio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "faturamentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faturamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "convenio_id", nullable = false)
    private Convenio convenio;

    @Column(nullable = false)
    private LocalDate periodoInicio;

    @Column(nullable = false)
    private LocalDate periodoFim;

    @Column(nullable = false)
    private Integer consultasRealizadas;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal faturamentoDevido;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal faturamentoTotal;

    @Column(nullable = false)
    private LocalDate dataGeracao;
}