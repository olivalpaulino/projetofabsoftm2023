package br.univille.projetofabsoftm2023.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(length = 600)
    @NotBlank(message = "Campo nome não pode ser em branco")
    private String nome; 
    
    @Column(length = 600)
    @NotBlank(message = "Campo cpf não pode ser em branco")
    private String cpf; 
    
    @Column(length = 600)
    @NotBlank(message = "Campo endereço não pode ser em branco")
    private String endereco; 
    
    @Column(length = 600)
    @NotBlank(message = "Campo estado não pode ser em branco")
    private String estado;
    
    @Column(length = 600)
    @NotBlank(message = "Campo telefone não pode ser em branco")
    private String telefone;
    
    @Column(length = 600)
    @NotBlank(message = "Campo email não pode ser em branco")
    private String email;
    
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    } 

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
