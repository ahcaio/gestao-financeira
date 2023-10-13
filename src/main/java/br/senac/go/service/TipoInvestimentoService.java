package br.senac.go.service;

import br.senac.go.interfaces.IService;
import br.senac.go.model.TipoInvestimento;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TipoInvestimentoService implements IService<TipoInvestimento, Integer> {

    @Override
    public TipoInvestimento create(TipoInvestimento entity) {
        log.info("Método TipoInvestimentoService.create executado");
        log.debug(String.format("Método TipoInvestimentoService.create executado com o objeto: %s", entity.toString()));
        return null;
    }

    @Override
    public TipoInvestimento readById(Integer id) throws Exception {
        log.info("Método TipoInvestimentoService.readById executado");
        log.debug(String.format("Método TipoInvestimentoService.readById executado com o valor: %d", id));
        return null;
    }

    @Override
    public TipoInvestimento read(TipoInvestimento entity) throws Exception {
        log.info("Método TipoInvestimentoService.read executado");
        log.debug(String.format("Método TipoInvestimentoService.read executado com o objeto: %s", entity.toString()));
        return null;
    }

    @Override
    public TipoInvestimento update(TipoInvestimento entity) {
        log.info("Método TipoInvestimentoService.update executado");
        log.debug(String.format("Método TipoInvestimentoService.update executado com o objeto: %s", entity.toString()));
        return null;
    }

    @Override
    public TipoInvestimento updatePart(Integer id, TipoInvestimento entity) throws Exception {
        log.info("Método TipoInvestimentoService.updatePart executado");
        log.debug(String.format("Método TipoInvestimentoService.updatePart executado com o objeto: %d | %s", id, entity.toString()));
        return null;
    }

    @Override
    public TipoInvestimento updateFull(Integer id, TipoInvestimento entity) {
        log.info("Método TipoInvestimentoService.updateFull executado");
        log.debug(String.format("Método TipoInvestimentoService.updateFull executado com o objeto: %d | %s", id, entity.toString()));
        return null;
    }

    @Override
    public TipoInvestimento deleteById(Integer id) {
        log.info("Método TipoInvestimentoService.deleteById executado");
        log.debug(String.format("Método TipoInvestimentoService.deleteById executado com o valor: %d", id));
        return null;
    }

    @Override
    public TipoInvestimento delete(TipoInvestimento entity) {
        log.info("Método TipoInvestimentoService.delete executado");
        log.debug(String.format("Método TipoInvestimentoService.delete executado com o objeto: %s", entity.toString()));
        return null;
    }
}
