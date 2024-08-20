package brianpelinku;

import brianpelinku.dao.EventoDAO;
import brianpelinku.entities.Evento;
import brianpelinku.enums.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-d2");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        EventoDAO ed = new EventoDAO(em);

        // SAVE
        Evento evento1 = new Evento("ferragosto", "2024/7/4", "evento estivo", TipoEvento.PUBBLICO, 1000);

        ed.save(evento1);


        em.close();
        emf.close();
    }
}
