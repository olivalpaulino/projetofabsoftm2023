
package br.univille.projetofabsoftm2023.controller;

import br.univille.projetofabsoftm2023.entity.Venda;
import br.univille.projetofabsoftm2023.service.VendaService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/venda")
public class VendaController {
    
    @Autowired
    private VendaService vendaService;
    
    @GetMapping
    public ModelAndView Index(){
        var listaVendas = vendaService.getAll();
        return new ModelAndView("venda/index", 
            "listaVendas", listaVendas);
    }
    
    @GetMapping("/novo")
    public ModelAndView novo(){
        var venda = new Venda();
        return new ModelAndView("venda/form",
                                "venda",venda);
    }
    
    @PostMapping(params = "form")
    public ModelAndView save(@Valid Venda venda, BindingResult bindingResult){
        //Salvar o produto no banco de dados
        if(bindingResult.hasErrors()) {
            return new ModelAndView("venda/form", "venda", venda);
        }
        
        vendaService.save(venda);
        return new ModelAndView("redirect:/venda");
    }
    
    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Venda venda){
        return new ModelAndView("venda/form", "venda",venda);
    }
    
    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") long id){
        
        vendaService.delete(id);
        return new ModelAndView("redirect:/venda");
    }
}
