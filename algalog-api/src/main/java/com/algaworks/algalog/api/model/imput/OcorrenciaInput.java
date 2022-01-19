package com.algaworks.algalog.api.model.imput;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaInput {

	@NotBlank
	private String descricao;
}
