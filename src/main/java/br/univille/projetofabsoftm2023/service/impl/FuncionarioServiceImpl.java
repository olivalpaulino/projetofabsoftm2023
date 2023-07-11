package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Funcionario;
import br.univille.projetofabsoftm2023.repository.FuncionarioRepository;
import br.univille.projetofabsoftm2023.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl
        implements FuncionarioService {

@Autowired
 private FuncionarioRepository repository;

            
@Override
public List<Funcionario> getALL() {
    return repository.findAll();
    }

@Override
public void save(Funcionario funcionario) {
        repository.save(funcionario);
    }

@Override
public void delete(long id) {
        repository.deleteById(id);
    }

    
}
