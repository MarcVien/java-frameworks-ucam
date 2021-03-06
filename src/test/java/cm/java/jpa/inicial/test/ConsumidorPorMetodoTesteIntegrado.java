package cm.java.jpa.inicial.test;


import cm.java.jpa.entidades.ConsumidorPorMetodos;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class ConsumidorPorMetodoTesteIntegrado extends TestePersistenciaAbstrato {

  // ======================================
  // =           Testes Unitários         =
  // ======================================

  @Test
  public void deveriaCriarUmConsumidor() throws Exception {

    ConsumidorPorMetodos consumidor = new ConsumidorPorMetodos("Joana", "Oliveira", "joliveira@empresa.com", "1234565");
    tx.begin();
    em.persist(consumidor);
    tx.commit();
    assertNotNull("O ID não deveria ser nulo", consumidor.getId());
  }
}