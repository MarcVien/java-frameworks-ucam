package cm.java.jpa.inicial.test;

import cm.java.jpa.entidades.Livro;
import cm.java.jpa.inicial.TestePersistenciaAbstrato;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LivroTesteIntegrado extends TestePersistenciaAbstrato {

    // ======================================
    // =           Teste Unitario           =
    // ======================================
    @Test
    public void deveriaCriarUmLivro() throws Exception {

        Livro livro = new Livro(getIdRandomico(), "Guia do Muchileiro das Galáxias", 12.5F, "O Guia do Mochileiro das Galáxias é uma série de comédia ficção científica criada por Douglas Adams.", "1-84023-742-2", 354, false);
        tx.begin();
        em.persist(livro);
        tx.commit();
        assertNotNull("O ID não deveria ser nulo", livro.getId());
    }
}
