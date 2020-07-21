package com.algaworks.algafood.jpa.restaurante;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.MobileFoodApiApplication;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

public class RestauranteConsultaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(MobileFoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
			
		RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);
		
		List<Restaurante> todosRestauranteCadastrados = restaurantes.buscarTodas();
		
		for (Restaurante restaurante : todosRestauranteCadastrados) {
			System.out.printf("\nRestaurantes cadastradas: Nome: %s Taxa Entrega: %.2f \n"
					,restaurante.getNome()
					,restaurante.getTaxaFrete());
//					,restaurante.getCozinhas();
		}
	}
}
