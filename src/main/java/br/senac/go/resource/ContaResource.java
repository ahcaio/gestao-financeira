package br.senac.go.resource;

import br.senac.go.interfaces.IResource;

import br.senac.go.model.Conta;
import br.senac.go.service.ContaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j //fazer log das requisições
@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/api/conta")
@Tag(name = "conta", description = "documentação ao resource conta")
/*@Tags({
        @Tag(name = "conta", description = "documentação ao resource conta"),
        @Tag(name = "investimento", description = "documentação para conta de investimento")
})*/

//@AllArgsConstructor(onConstructor = @__(@Autowired)) //forma 03
public class ContaResource implements IResource<Conta,Integer> {

    @Autowired //forma 01
    ContaService contaService;

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    @Operation(
            summary = "Cria uma conta",
            description = "Método responsável para criar uma conta no sistema",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Conta create(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.create");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.create | valores: %s",entity.toString()));
        Conta conta = contaService.create(entity);
        return conta;
    }

    @Override
    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Recupera uma conta",
            description = "Método responsável para recuperar uma conta no sistema",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    public Conta read(@Valid @RequestBody Conta entity) throws Exception {
        log.info("Executado método ContaResource.read");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.read | valores: %s",entity.toString()));
        Conta conta = contaService.read(entity);
        return conta;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Recupera uma conta baseado em um identificador",
            description = "Método responsável para recuperar uma conta no sistema baseado no identificador",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })

    public Conta readById(@PathVariable Integer id) throws Exception {
        log.info("Executado método ContaResource.readById");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.readById | valores: %d",id));
        Conta conta = contaService.readById(id);
        return conta;
    }

    @Override
    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza uma conta",
            description = "Método responsável para atualizar uma conta.",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Conta update(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.update");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.update | valores: %s",entity.toString()));
        Conta conta = contaService.update(entity);
        return conta;
    }

    @Override
    @PatchMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza parte de uma conta",
            description = "Método responsável para atualizar parte de uma conta.",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Conta updatePart(@PathVariable Integer id, @Valid @RequestBody Conta entity) throws Exception {
        log.info("Executado método ContaResource.updatePart");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.updatePart | valores: %d, %s",id, entity.toString()));
        Conta conta = contaService.updatePart(id, entity);
        return conta;
    }

    @Override
    @PutMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza todos os dados de uma conta",
            description = "Método responsável para atualizar todos os dados de uma conta.",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public Conta updateFull(@PathVariable Integer id, @Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.updateFull");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.updateFull | valores: %d, %s",id, entity.toString()));

        Conta conta = contaService.updateFull(id, entity);
        return conta;
    }

    @Override
    @DeleteMapping("/{id}")
    @Operation(
            summary = "Delete uma conta com base no identificador.",
            description = "Método responsável para deletar uma conta com base no identificador",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public void delete(@PathVariable Integer id) {
        log.info("Executado método ContaResource.delete");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.delete | valores: %d",id));
        Conta conta = contaService.deleteById(id);
    }

    @Override
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Delete uma conta com base no objeto informado.",
            description = "Método responsável para deletar uma conta com base no objeto informado.",
            tags = {"conta"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Conta.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public void deleteByEntity(@Valid @RequestBody Conta entity) {
        log.info("Executado método ContaResource.deleteByEntity");
        //log.debug("Executado método ContaResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método ContaResource.deleteByEntity | valores: %s",entity.toString()));
        Conta conta = contaService.delete(entity);
    }
}
