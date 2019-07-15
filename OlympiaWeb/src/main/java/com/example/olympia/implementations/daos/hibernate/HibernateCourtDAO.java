package com.example.olympia.implementations.daos.hibernate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.olympia.abstractions.daos.CourtDAO;
import com.example.olympia.entities.Court;

@Repository
public class HibernateCourtDAO implements CourtDAO {

	@Autowired
	private EntityManager manager;
	
	@Override
	public Court findById(int id) {
		Court found = manager.find(Court.class, id);
		return found;

	}

}
