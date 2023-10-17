package org.example;

import org.example.utils.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Application {

    public static void main(String[] args) {

        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        System.out.println("fin qui tutto bene");
        emf.close();
        em.close();
        System.out.println("chiuso tutto");

    }
}
