package br.univille.projetofabsoftm2023.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length = 600)
    @NotBlank(message = "Campo nome não pode ser em branco")
    private String nome; 
    
    @Column(length = 600) 
    @NotNull(message = "Campo preco não pode ser nula")
    private float preco; 
    
    @Column(length = 600)
    @NotNull(message = "Campo tipo não pode ser nula")
    private long tipo;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public long getTipo() {
        return tipo;
    }
    public void setTipo(long tipo) {
        this.tipo = tipo;
    }

}
