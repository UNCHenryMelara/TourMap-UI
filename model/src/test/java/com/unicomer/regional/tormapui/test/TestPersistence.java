/**
 * 
 */
package com.unicomer.regional.tormapui.test;

import javax.persistence.EntityManager;

import org.junit.Test;

import com.unicomer.regional.tourmapui.manager.PersistenceManager;
import com.unicomer.regional.tourmapui.model.TourService;

/**
 * @author henry_melara
 *
 */
public class TestPersistence {

	@Test
	public void test() {
		TourService tourmap = new TourService();
		tourmap.setTourName("Dhaka")
	        .setTourFile("Bangladesh");
		
	    EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
	    em.getTransaction().begin();
	    em.persist(tourmap);
	    em.getTransaction().commit();
	    em.close();
	    PersistenceManager.INSTANCE.close();
		//fail("Not yet implemented");
	}

}
