package com.example.olympia.implementations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.olympia.abstractions.daos.CourtDAO;
import com.example.olympia.abstractions.services.CourtService;
import com.example.olympia.entities.Court;

@Service
public class CourtServiceStandard implements CourtService{
  
	@Autowired
	private CourtDAO courtDao;

	@Override
	@Transactional
	public Court findById(int id) {
		return courtDao.findById(id);
		
	}
	
	
	
	
}
