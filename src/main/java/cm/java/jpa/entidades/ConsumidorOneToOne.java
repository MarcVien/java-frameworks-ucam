/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.java.jpa.entidades;

import javax.persistence.*;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

/**
 *
 * @author Marcelo
 */
@Entity
public class ConsumidorOneToOne {
    @Id
    @GeneratedValue
    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String email;
    private String numeroDeTelefone;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ce_endereco", nullable = false)
    private EnderecoEnt endereco;
    private Endereco enderecoNormal;

    public ConsumidorOneToOne() {
    }

    public ConsumidorOneToOne(String primeiroNome, String ultimoNome, String email, String numeroDeTelefone, EnderecoEnt endereco) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.email = email;
        this.numeroDeTelefone = numeroDeTelefone;
        this.endereco = endereco;
    }
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public EnderecoEnt getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEnt endereco) {
        this.endereco = endereco;
    }

    public Endereco getEnderecoNormal() {
        return enderecoNormal;
    }

    public void setEnderecoNormal(Endereco enderecoNormal) {
        this.enderecoNormal = enderecoNormal;
    }
    
    
    
    
}
