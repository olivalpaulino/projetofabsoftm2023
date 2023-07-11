package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Usuario;

import br.univille.projetofabsoftm2023.service.UsuarioService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ModelAndView index() {
        var listaUsuarios = usuarioService.getAll();
        return new ModelAndView("usuario/index",
                "listaUsuarios", listaUsuarios);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var usuario = new Usuario();
        return new ModelAndView("usuario/form",
                "usuario", usuario);
    }

    @PostMapping(params = "form")
    public ModelAndView save(@Valid Usuario usuario, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return new ModelAndView("usuario/form", "usuario", usuario);
        }
        
        usuarioService.save(usuario);
        return new ModelAndView("redirect:/usuario");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Usuario usuario) {

        return new ModelAndView("usuario/form",
                "usuario", usuario);
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") long id) {

        usuarioService.delete(id);
        return new ModelAndView("redirect:/usuario");
    }

}
