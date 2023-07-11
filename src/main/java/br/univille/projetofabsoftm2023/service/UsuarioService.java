package br.univille.projetofabsoftm2023.service;

import java.util.List;
import br.univille.projetofabsoftm2023.entity.Usuario;

public interface UsuarioService {
    List<Usuario> getAll();

    void save(Usuario usuario);

    void delete(long id);

}
