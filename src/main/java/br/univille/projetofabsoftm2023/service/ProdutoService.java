package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.Produto;

public interface ProdutoService {
    List<Produto> getAll();

    void save(Produto produto);

    void delete(long id);
}
