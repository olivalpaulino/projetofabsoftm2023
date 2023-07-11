package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Produto;
import br.univille.projetofabsoftm2023.repository.ProdutoRepository;
import br.univille.projetofabsoftm2023.service.ProdutoService;

@Service
public class ProdutoServiceImpl 
    implements ProdutoService{

    @Autowired
    private ProdutoRepository repository;

    @Override
    public List<Produto> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Produto produto) {
        repository.save(produto);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}


    /*
     * git add .
     * git commit -m "muita coisa"
     * git push
     */