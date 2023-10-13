package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "CARTEIRA")
public class Carteira {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto-incremento
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME", length = 128, nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", length = 128, nullable = false)
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Pessoa> pessoas = new ArrayList<>();
}
