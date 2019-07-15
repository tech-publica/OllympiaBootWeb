package com.example.olympia.abstractions.daos;

import com.example.olympia.entities.Court;

public interface CourtDAO {
     Court findById(int id);
}
