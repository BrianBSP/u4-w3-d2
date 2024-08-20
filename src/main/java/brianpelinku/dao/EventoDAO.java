package brianpelinku.dao;

import brianpelinku.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {

    private EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Evento evento) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(evento);

        transaction.commit();

        System.out.println("L'evento " + evento + " è stato salvato!");

    }

    /*public Evento getById(long idEvento){

    }*/

    public void delete(long idEvento) {

    }
}
