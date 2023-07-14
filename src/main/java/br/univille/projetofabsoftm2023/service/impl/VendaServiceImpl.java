/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univille.projetofabsoftm2023.service.impl;

import br.univille.projetofabsoftm2023.repository.VendaRepository;
import br.univille.projetofabsoftm2023.entity.Venda;
import br.univille.projetofabsoftm2023.service.VendaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository repository;

    @Override
    public List<Venda> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Venda venda) {
        repository.save(venda);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
