package br.univille.projetofabsoftm2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetofabsoftm2023.entity.Produto;

@Repository
public interface ProdutoRepository 
    extends JpaRepository<Produto,Long>{
    
}
