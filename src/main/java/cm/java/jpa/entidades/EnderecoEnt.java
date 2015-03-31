/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.java.jpa.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Marcelo
 */
@Entity
@Table(name="t_endereco_222")
public class EnderecoEnt {
    
  // ======================================
  // =             Atributos             =
  // ======================================

  @Id
  @GeneratedValue
  private Long id;
  private String rua1;
  private String rua2;
  private String cidade;
  private String estado;
  private String cep;

  public EnderecoEnt(){
  
  }

    public EnderecoEnt(String rua1Param, String rua2, String cidade, String estado, String cep) {
        rua1 = rua1Param;
        this.rua2 = rua2;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

  
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua1() {
        return rua1;
    }

    public void setRua1(String rua1) {
        this.rua1 = rua1;
    }

    public String getRua2() {
        return rua2;
    }

    public void setRua2(String rua2) {
        this.rua2 = rua2;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

  
}
