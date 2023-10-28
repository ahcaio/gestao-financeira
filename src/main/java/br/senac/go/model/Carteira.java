package br.senac.go.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity //Esta anotação o ORM faz o controle de estado desta classe
@Table(name = "CARTEIRA")
public class Carteira {

    @Id //fala que este item é chave primária
    @GeneratedValue(strategy= GenerationType.AUTO) //auto-incremental
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME", length = 120, nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", length = 120, nullable = false)
    private String descricao;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Pessoa> pessoas = new ArrayList<>();

}
