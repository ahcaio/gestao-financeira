package br.senac.go.resource;

import br.senac.go.interfaces.IResource;
import br.senac.go.model.Pessoa;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.*;


@RestController("api/pessoa")
@Tag(name="pessoa", description ="documentação da classe pessoa")
public class PessoaResource implements IResource<Pessoa, Integer> {
    @Override
    @PostMapping
    public Pessoa create(Pessoa entity) {
        return null;
    }

    @Override
    @GetMapping
    public Pessoa read(Pessoa entity) {
        return null;
    }

    @Override
    @GetMapping("/id")
    public Pessoa readById(@PathVariable("id") Integer id) {
        return null;
    }

    @Override
    @PutMapping
    public Pessoa update(Pessoa entity) {
        return null;
    }

    @Override
    @PatchMapping("/id")
    public Pessoa updatePart(Integer id, Pessoa entity) {
        return null;
    }

    @Override
    @PutMapping("/id")
    public Pessoa updateFull(Integer id, Pessoa entity) {
        return null;
    }

    @Override
    @DeleteMapping("/id")
    public void delete(@PathVariable("id") Integer id) {
    }

    @DeleteMapping
    public void deleteByEntity(Pessoa entity) {
    }
}
