package com.example.olympia.implementations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.olympia.abstractions.daos.ClientDAO;
import com.example.olympia.abstractions.services.ClientService;
import com.example.olympia.entities.Client;

@Service
public class ClientServiceStandard implements ClientService{

	@Autowired
	private ClientDAO clientDao;
	
	@Override
	@Transactional
	public Client findById(int id) {
		return clientDao.findById(id);
	}

}
