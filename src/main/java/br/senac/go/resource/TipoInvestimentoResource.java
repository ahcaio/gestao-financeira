package br.senac.go.resource;

import br.senac.go.interfaces.IResource;
import br.senac.go.model.Investimento;
import br.senac.go.model.TipoInvestimento;
import br.senac.go.service.InvestimentoService;
import br.senac.go.service.TipoInvestimentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j //fazer log das requisições
@RestController
@RequestMapping(path = "/api/tipo_investimento")
@Tag(name = "tipo_investimento", description = "documentação da classe TipoInvestimento")
public class TipoInvestimentoResource implements IResource<TipoInvestimento, Integer> {

    @Autowired //forma 01
    TipoInvestimentoService tipoInvestimentoService;

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    @Operation(
            summary = "Cria um tipo de investimento",
            description = "Método responsável para criar um tipo de investimento no sistema",
            tags = {"tipo_investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "304", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public TipoInvestimento create(@Valid @RequestBody TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoResource.create");
        log.debug(String.format("Executado método TipoInvestimentoResource.create | valores: %s",entity.toString()));
        TipoInvestimento tipoInvestimento = tipoInvestimentoService.create(entity);
        return tipoInvestimento;
    }

    @Override
    @GetMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Recupera um tipo de investimento",
            description = "Método responsável para recuperar um tipo de investimento no sistema",
            tags = {"tipo_investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public TipoInvestimento read(@Valid @RequestBody TipoInvestimento entity) throws Exception {
        log.info("Executado método TipoInvestimentoResource.read");
        //log.debug("Executado método InvestimentoResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método TipoInvestimentoResource.read | valores: %s",entity.toString()));
        TipoInvestimento tipoInvestimento = tipoInvestimentoService.read(entity);
        return tipoInvestimento;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Recupera um tipo de investimento baseado em um identificador",
            description = "Método responsável para recuperar um tipo de investimento no sistema baseado no identificador",
            tags = {"tipo_investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public TipoInvestimento readById(@PathVariable Integer id) throws Exception {
        log.info("Executado método TipoInvestimentoResource.readById");
        //log.debug("Executado método InvestimentoResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método TipoInvestimentoResource.readById | valores: %d",id));
        TipoInvestimento tipoInvestimento = tipoInvestimentoService.readById(id);
        return tipoInvestimento;
    }

    @Override
    @PutMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza um tipo de investimento",
            description = "Método responsável para atualizar um tipo de  investimento.",
            tags = {"tipo_investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public TipoInvestimento update(@Valid @RequestBody TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoResource.update");
        //log.debug("Executado método InvestimentoResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método TipoInvestimentoResource.update | valores: %s",entity.toString()));
        TipoInvestimento tipoInvestimento = tipoInvestimentoService.update(entity);
        return tipoInvestimento;
    }

    @Override
    @PatchMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza parte de um tipo de investimento",
            description = "Método responsável para atualizar parte de um tipo de investimento.",
            tags = {"tipo_investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public TipoInvestimento updatePart(@PathVariable Integer id, @Valid @RequestBody TipoInvestimento entity) throws Exception {
        log.info("Executado método TipoInvestimentoResource.updatePart");
        //log.debug("Executado método TipoInvestimentoResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método TipoInvestimentoResource.updatePart | valores: %d, %s",id, entity.toString()));
        TipoInvestimento tipoInvestimento = tipoInvestimentoService.updatePart(id, entity);
        return tipoInvestimento;
    }

    @Override
    @PutMapping(value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Atualiza todos os dados de um tipo de investimento",
            description = "Método responsável para atualizar todos os dados de um tipo de investimento.",
            tags = {"tipo_investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public TipoInvestimento updateFull(@PathVariable  Integer id, @Valid @RequestBody TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoResource.updateFull");
        //log.debug("Executado método TipoInvestimentoResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método TipoInvestimentoResource.updateFull | valores: %d, %s",id, entity.toString()));
        TipoInvestimento tipoInvestimento = tipoInvestimentoService.updateFull(id, entity);
        return tipoInvestimento;    }

    @Override
    @DeleteMapping("/id")
    @Operation(
            summary = "Delete um tipo de investimento com base no identificador.",
            description = "Método responsável para deletar um tipo de investimento com base no identificador",
            tags = {"tipo_investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public void delete(@PathVariable Integer id) {
        log.info("Executado método TipoInvestimentoResource.delete");
        //log.debug("Executado método TipoInvestimentoResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método TipoInvestimentoResource.delete | valores: %d",id));
        TipoInvestimento tipoInvestimento = tipoInvestimentoService.deleteById(id);
    }

    @Override
    @DeleteMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @Operation(
            summary = "Delete um tipo de investimento com base no objeto informado.",
            description = "Método responsável para deletar um tipo de investimento com base no objeto informado.",
            tags = {"tipo_investimento"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = TipoInvestimento.class), mediaType = MediaType.APPLICATION_JSON_VALUE) }),
            @ApiResponse(responseCode = "303", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    public void deleteByEntity(@Valid @RequestBody TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoResource.deleteByEntity");
        //log.debug("Executado método TipoInvestimentoResource.create com os seguinte valores:"+entity);
        log.debug(String.format("Executado método TipoInvestimentoResource.deleteByEntity | valores: %s",entity.toString()));
        TipoInvestimento tipoInvestimento = tipoInvestimentoService.delete(entity);
    }
}
