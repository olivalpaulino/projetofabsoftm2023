package br.univille.projetofabsoftm2023.service;

import java.util.List;

import br.univille.projetofabsoftm2023.entity.Funcionario;

public interface FuncionarioService {
    List<Funcionario> getALL();

    void save(Funcionario funcionario);

    void delete(long id);
}
