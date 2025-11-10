package br.com.consultorio.model;

import br.com.consultorio.model.enums.Sexos;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(length = 200)
    private String endereco;

    @Column(length = 20)
    private String telefone;

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(length = 20)
    private String rg;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Sexos sexo;

    @ManyToOne
    @JoinColumn(name = "convenio_id")
    private Convenio convenio;

    // Informações da ficha médica
    @Column(length = 500)
    private String queixaPrincipal;

    @Column(length = 1000)
    private String antecedentes;

    @Column(length = 1000)
    private String historiaDoenca;

    @Column(length = 500)
    private String diagnostico;

    @Column(length = 500)
    private String medicacao;

    @Column(length = 500)
    private String examesAparelhosSistemas;

    @Column(length = 500)
    private String examesComplementares;

    @Column(nullable = false)
    private Boolean ativo = true; // Para cumprir RF005 - informações não podem ser removidas
}