package br.com.consultorio.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "cids")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 10)
    private String codigo;

    @Column(nullable = false, length = 200)
    private String descricao;

    @Column(length = 500)
    private String descricaoCompleta;
}