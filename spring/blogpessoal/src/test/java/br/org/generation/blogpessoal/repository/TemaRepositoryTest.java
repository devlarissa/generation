package br.org.generation.blogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import br.org.generation.blogpessoal.model.Tema;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TemaRepositoryTest {

	@Autowired
	private TemaRepository temaRepository;
	
	@BeforeAll
	void start() {
		
		temaRepository.save(new Tema(0L, "Esportes Teste"));
		temaRepository.save(new Tema(0L, "Aventura Teste"));
		temaRepository.save(new Tema(0L, "DIY"));
		temaRepository.save(new Tema(0L, "Suspense Teste"));
		
	}
	
	@Test
	@DisplayName("Retorna 3 temas")
	public void deveRetornarTresDescricoesDeTemas() {
		
		List<Tema> listaDeTemas = temaRepository.findAllByDescricaoContainingIgnoreCase("teste");
		
		assertEquals(3, listaDeTemas.size());
		assertTrue(listaDeTemas.get(0).getDescricao().equals("Esportes Teste"));
		assertTrue(listaDeTemas.get(1).getDescricao().equals("Aventura Teste"));
		assertTrue(listaDeTemas.get(2).getDescricao().equals("Suspense Teste"));
		
	}
}
