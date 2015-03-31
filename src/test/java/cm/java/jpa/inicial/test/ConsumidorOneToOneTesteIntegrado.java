/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.java.jpa.inicial.test;

import cm.java.jpa.entidades.ConsumidorOneToOne;
import cm.java.jpa.entidades.Endereco;
import cm.java.jpa.entidades.EnderecoEnt;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class ConsumidorOneToOneTesteIntegrado extends TestePersistenciaAbstrato{
    // ======================================
  // =           Testes Unitários         =
  // ======================================

  @Test
   public void deveriaCriarUmConsumidor() throws Exception {
     EnderecoEnt endereco = new EnderecoEnt("Rua A", "Rua B", "LugarNenhum","EstadoNenhum", "CEPNenhum");
     ConsumidorOneToOne consumidor = new ConsumidorOneToOne("João", "Ninguém", "joao@ninguem.com", "5555", endereco);

     Endereco enderecoAntigo = new Endereco(null,"Rua A", "Rua B", "LugarNenhum","EstadoNenhum", "CEPNenhum","paisnenhum");
     consumidor.setEnderecoNormal(enderecoAntigo);
     
    tx.begin();
    em.persist(enderecoAntigo);
    em.persist(endereco);
    em.persist(consumidor);
    tx.commit();
    assertNotNull("O ID não deveria ser nulo", consumidor.getId());
  }
}
