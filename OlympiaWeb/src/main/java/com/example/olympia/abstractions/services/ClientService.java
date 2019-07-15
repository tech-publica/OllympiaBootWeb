package com.example.olympia.abstractions.services;

import com.example.olympia.entities.Client;

public interface ClientService {
    Client findById(int id);
    
}
