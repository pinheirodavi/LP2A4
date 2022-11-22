package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Smartphone;

public class AplicacaoResolvida {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emFactory.createEntityManager();
		
		List<Smartphone> listaVeic = em.createQuery("FROM Smartphone s join fetch s.usuario", Smartphone.class).getResultList();
		System.out.println(listaVeic);
	}
}