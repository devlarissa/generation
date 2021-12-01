package br.org.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{ 
	//heranca de jpaRepository, com o objeto da classe principal postagem, com o atributo Long (chave primaria) 

}
