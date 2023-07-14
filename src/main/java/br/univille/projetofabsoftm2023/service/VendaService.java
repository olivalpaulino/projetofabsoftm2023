/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univille.projetofabsoftm2023.service;

import br.univille.projetofabsoftm2023.entity.Venda;
import java.util.List;


public interface VendaService {
    List<Venda> getAll();

    void save(Venda venda);

    void delete(long id);
}
