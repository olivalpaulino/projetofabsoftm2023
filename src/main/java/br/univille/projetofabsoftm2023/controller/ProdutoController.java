package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Produto;

import br.univille.projetofabsoftm2023.service.ProdutoService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ModelAndView Index(){
        var listaProdutos = produtoService.getAll();
        return new ModelAndView("produto/index", 
            "listaProdutos", listaProdutos);
    }
    
    @GetMapping("/novo")
    public ModelAndView novo(){
        var produto = new Produto();
        return new ModelAndView("produto/form",
                                "produto",produto);
    }

    @PostMapping(params = "form")
    public ModelAndView save(@Valid Produto produto, BindingResult bindingResult){
        //Salvar o produto no banco de dados
        if(bindingResult.hasErrors()) {
            return new ModelAndView("produto/form", "produto", produto);
        }
        
        produtoService.save(produto);
        return new ModelAndView("redirect:/produto");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") 
                            Produto produto){
        
        return new ModelAndView("produto/form", 
                                    "produto",produto);
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") long id){
        
        produtoService.delete(id);
        return new ModelAndView("redirect:/produto");
    }

}
