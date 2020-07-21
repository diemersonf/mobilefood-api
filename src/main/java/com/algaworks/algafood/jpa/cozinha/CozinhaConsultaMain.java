package com.algaworks.algafood.jpa.cozinha;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.MobileFoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class CozinhaConsultaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(MobileFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
			
		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> todasCozinhasCadastradas = cozinhas.buscarTodas();
		
		for (Cozinha cozinha : todasCozinhasCadastradas) {
			System.out.println("Cozinhas cadastradas: " + cozinha.getNome());
		}
	}
}
