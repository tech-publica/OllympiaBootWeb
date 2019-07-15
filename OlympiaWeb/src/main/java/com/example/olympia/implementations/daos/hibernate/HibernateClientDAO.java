package com.example.olympia.implementations.daos.hibernate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.olympia.abstractions.daos.ClientDAO;
import com.example.olympia.entities.Client;

@Repository
public class HibernateClientDAO implements ClientDAO {

	@Autowired
	private EntityManager manager;

	@Override 
	public Client findById(int id) {
		Client found = manager.find(Client.class, id);
		return found;

	}

}
