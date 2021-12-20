package br.org.generation.blogpessoal.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.org.generation.blogpessoal.model.Tema;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TemaControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	@Order(1)
	@DisplayName("Cadastrar Um Tema")
	public void deveCriarUmTema() {

		HttpEntity<Tema> requisicao = new HttpEntity<Tema>(new Tema(0L, "Viagem"));

		ResponseEntity<Tema> resposta = testRestTemplate.withBasicAuth("root", "root").exchange("/tema/cadastrar",
				HttpMethod.POST, requisicao, Tema.class);

		assertEquals(HttpStatus.CREATED, resposta.getStatusCode());
		assertEquals(requisicao.getBody().getDescricao(), resposta.getBody().getDescricao());

	}

	@Test
	@Order(2)
	@DisplayName("Não deve permitir a criacao de um tema")
	public void naoDeveCriarTema() {
		HttpEntity<Tema> requisicao = new HttpEntity<Tema>(new Tema(0L, "Viagem"));

		ResponseEntity<Tema> resposta = testRestTemplate.exchange("/tema/cadastrar", HttpMethod.POST, requisicao,
				Tema.class);

		assertEquals(HttpStatus.UNAUTHORIZED, resposta.getStatusCode());

	}

	@Test
	@Order(3)
	@DisplayName("Alterar um Tema")
	public void deveAlterarTema() {

		Tema criaTema = new Tema(0L, "Esportes");
		Tema alteraTema = new Tema(criaTema.getId(), "E-sports");

		HttpEntity<Tema> requisicao = new HttpEntity<Tema>(alteraTema);
		ResponseEntity<Tema> resposta = testRestTemplate
				.withBasicAuth("root", "root")
				.exchange("/tema/atualizar", HttpMethod.PUT, requisicao, Tema.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals(alteraTema.getDescricao(), resposta.getBody().getDescricao());

	}
	
	@Test
	@Order(4)
	@DisplayName("Listar todos os temas")
	public void deveMostrarTodosTemas() {
		
		ResponseEntity<String> resposta = testRestTemplate
				.withBasicAuth("root", "root")
				.exchange("/tema/todos", HttpMethod.GET, null, String.class);
		
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		
	}

}
