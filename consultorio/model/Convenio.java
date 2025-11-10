package br.com.consultorio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Entity
@Table(name = "convenios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Convenio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(length = 20)
    private String telefone;

    @Column(length = 200)
    private String endereco;

    @Column(nullable = false, unique = true, length = 18)
    private String cnpj;

    @Column(length = 500)
    private String planosFornecidos;

    @OneToMany(mappedBy = "convenio", cascade = CascadeType.ALL)
    private List<Paciente> pacientes;
}