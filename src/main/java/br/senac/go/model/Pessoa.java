package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //faz os métodos get, set, tostring, hashcode, equeals
@Entity // fala para o ORMA gerenciar o estado deste item no banco de dados
@Table(name = "PESSOA") // Nomeia a tabela do banco de dados
public class Pessoa {

    @Id //Fala que é chave primári
    @GeneratedValue(strategy = GenerationType.AUTO) // auto-incremento
    @Column(name = "ID") // Nomeia o nome da coluna na tabela do banco de dados
    private Integer id;

    @Column(name = "NOME", length = 120, nullable = false) // Nomeia o nome da coluna na tabela do banco de dados
    private String nome;

    @Column(name = "ENDERECO") // Nomeia o nome da coluna na tabela do banco de dados
    private String endereco;

    @ManyToOne(fetch = FetchType.LAZY)
    private Carteira carteira;

}
