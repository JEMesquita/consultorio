package br.com.consultorio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "documentos_medicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentoMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @Column(nullable = false, length = 50)
    private String tipo; // RECEITA, ATESTADO

    @Column(nullable = false, length = 1000)
    private String conteudo;

    @Column(nullable = false)
    private LocalDateTime dataEmissao;

    @Column(length = 500)
    private String cabecalho;

    @Column(length = 500)
    private String rodape;

    @Column(nullable = false)
    private Boolean impresso = false;
}