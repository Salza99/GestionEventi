package org.example.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EventoDao {
    private final EntityManager em;

    public EventoDao(EntityManager em){
        this.em = em;
    }

    public void saveNewEvent(Evento e) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(e);
        transaction.commit();
        System.out.println("evento aggiunto a database");
    }
    public Evento searchById(long id) {
        return em.find(Evento.class,id);
    }
}
