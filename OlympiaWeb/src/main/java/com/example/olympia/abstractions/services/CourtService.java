package com.example.olympia.abstractions.services;

import com.example.olympia.entities.Court;

public interface CourtService {
    Court findById(int id);
}
