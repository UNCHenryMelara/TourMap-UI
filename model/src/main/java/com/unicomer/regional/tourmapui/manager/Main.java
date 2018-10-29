package com.unicomer.regional.tourmapui.manager;

import javax.persistence.EntityManager;

import com.unicomer.regional.tourmapui.model.TourService;

public class Main {
  public static void main(String[] args) 
  {
	  TourService tourmap = new TourService();
		tourmap.setTourName("Dhaka")
	        .setTourFile("Bangladesh");
		
	    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    em.getTransaction().begin();
	    em.persist(tourmap);
	    em.getTransaction().commit();
	    em.close();
	    PersistenceManager.INSTANCE.close();
  }
}