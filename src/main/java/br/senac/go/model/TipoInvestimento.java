package br.senac.go.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "TIPO_INVESTIMENTO")
public class TipoInvestimento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "TEM_RISCO")
    private boolean temRisco;

    @Column(name = "DATA_INICIO")
    private LocalDateTime dataInicio;

    @Column(name = "DATA_FIM")
    private LocalDateTime dataFim;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Investimento investimento;
}
