package com.educandoweb;
import dominio.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "João", "joao@email.com");
        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@email.com");
        Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@email.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Pronto");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
