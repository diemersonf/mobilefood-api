package com.diemerson.mobilefood.api.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CidadeInput {
    @NotBlank
    private String nome;
    private EstadoIdInput estado;

}
