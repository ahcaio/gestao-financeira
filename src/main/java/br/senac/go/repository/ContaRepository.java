package br.senac.go.repository;

import br.senac.go.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {

    public Conta getContaByDataFim(LocalDateTime dataFim);
    public Conta searchById(Integer id);

}
