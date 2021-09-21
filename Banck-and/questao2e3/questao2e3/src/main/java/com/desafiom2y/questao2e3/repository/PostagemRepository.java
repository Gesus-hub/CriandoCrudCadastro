package com.desafiom2y.questao2e3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiom2y.questao2e3.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByNomeEventoContainingIgnoreCase(String nomeEvento);

}
