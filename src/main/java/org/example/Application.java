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
            //Evento pop = new Evento("Pop", LocalDate.of(2023, 12,01), Type.PUBBLICO, 500);
            //edem.saveNewEvent(pop);
            Evento found = edem.searchById(3);
            if (found != null) {
                found.setTitolo("Poppss");
                System.out.println(found);
                em.refresh(found);
                System.out.println(found);
            }
            //edem.removeById(2);

        }catch (Exception ex) {
            System.err.println(ex.getMessage());
        }finally {
            emf.close();
            em.close();
        }







    }
}
