package com.example.olympia.abstractions.daos;

import com.example.olympia.entities.Client;

public interface ClientDAO {
   Client findById(int id);
}
