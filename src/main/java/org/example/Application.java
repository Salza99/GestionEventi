package org.example;

import org.example.entities.Evento;
import org.example.entities.EventoDao;
import org.example.entities.Type;
import org.example.utils.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();

        try {

            EventoDao edem = new EventoDao(em);
            //Evento rock = new Evento("Rock and Roll", LocalDate.of(2023, 11,01), Type.PUBBLICO, 1000);
            //edem.saveNewEvent(rock);
            System.out.println(edem.searchById(2));

        }catch (Exception ex) {
            System.err.println(ex.getMessage());
        }finally {
            emf.close();
            em.close();
        }







    }
}
