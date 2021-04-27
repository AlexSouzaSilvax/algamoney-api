package br.com.algaworks.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.algaworks.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	@Query(value = "select * from categoria where codigo = :codigo", nativeQuery = true)
	public Categoria buscaPeloCodigo(Long codigo);
}
