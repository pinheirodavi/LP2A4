package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Smartphone;

public class AplicacaoErro {

	public static void main(String[] args) {
	
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
		
		EntityManager em = emFactory.createEntityManager();

		List<Smartphone> listaSmartphone = em.createQuery("FROM Smartphone", Smartphone.class).getResultList();
		System.out.println(listaSmartphone);
	}
}