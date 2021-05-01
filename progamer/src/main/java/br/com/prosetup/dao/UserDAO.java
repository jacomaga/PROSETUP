package br.com.prosetup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.prosetup.model.User;
import br.com.prosetup.utils.JPAUtil;

public class UserDAO {
	
	
	
	public void store(User user) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.close();
		
	}

	public List<User> getAll() {
		EntityManager manager = JPAUtil.getEntityManager();
		String jpql = "SELECT S FROM User S";
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		return query.getResultList();		
	}
}
