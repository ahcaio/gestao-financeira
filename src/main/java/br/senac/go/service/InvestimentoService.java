package br.senac.go.service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.Conta;
import br.senac.go.model.Investimento;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InvestimentoService implements IService<Investimento, Integer> {
    @Override
    public Investimento create(Investimento entity) {
        log.info("Método InvestimentoService.create executado");
        log.debug(String.format("Método InvestimentoService.create executado com o objeto: %s", entity.toString()));
        return null;
    }

    @Override
    public Investimento readById(Integer id) throws Exception {
        log.info("Método InvestimentoService.readById executado");
        log.debug(String.format("Método InvestimentoService.readById executado com o valor: %d", id));
        return null;
    }

    @Override
    public Investimento read(Investimento entity) throws Exception {
        log.info("Método InvestimentoService.read executado");
        log.debug(String.format("Método InvestimentoService.read executado com o objeto: %s", entity.toString()));
        return null;    }

    @Override
    public Investimento update(Investimento entity) {
        log.info("Método InvestimentoService.update executado");
        log.debug(String.format("Método InvestimentoService.update executado com o objeto: %s", entity.toString()));
        return null;    }

    @Override
    public Investimento updatePart(Integer id, Investimento entity) throws Exception {
        log.info("Método InvestimentoService.updatePart executado");
        log.debug(String.format("Método InvestimentoService.updatePart executado com o objeto: %d | %s", id, entity.toString()));
        return null;
    }

    @Override
    public Investimento updateFull(Integer id, Investimento entity) {
        log.info("Método InvestimentoService.updateFull executado");
        log.debug(String.format("Método InvestimentoService.updateFull executado com o objeto: %d | %s", id, entity.toString()));
        return null;
    }

    @Override
    public Investimento deleteById(Integer id) {
        log.info("Método InvestimentoService.deleteById executado");
        log.debug(String.format("Método InvestimentoService.deleteById executado com o valor: %d", id));
        return null;
    }

    @Override
    public Investimento delete(Investimento entity) {
        log.info("Método InvestimentoService.delete executado");
        log.debug(String.format("Método InvestimentoService.delete executado com o objeto: %s", entity.toString()));
        return null;
    }
}
