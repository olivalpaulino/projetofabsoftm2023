package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Funcionario;

import br.univille.projetofabsoftm2023.service.FuncionarioService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController{

    @Autowired
    private FuncionarioService FuncionarioService;

    @GetMapping
    public ModelAndView index() {
        var listaFuncionarios = FuncionarioService.getALL();
        return new ModelAndView("funcionario/index",
                "listaFuncionarios", listaFuncionarios);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var funcionario = new Funcionario();
        return new ModelAndView("funcionario/form",
                "funcionario", funcionario);
    }

    @PostMapping(params = "form")
    public ModelAndView save(@Valid Funcionario funcionario, BindingResult bindingResult) {
        
        if(bindingResult.hasErrors()) {
            return new ModelAndView("funcionario/form", "funcionario", funcionario);
        }
        
        
        FuncionarioService.save(funcionario);
        return new ModelAndView("redirect:/funcionario");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Funcionario funcionario) {

        return new ModelAndView("funcionario/form",
                "funcionario", funcionario);
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") long id) {

        FuncionarioService.delete(id);
        return new ModelAndView("redirect:/funcionario");
    }

}
