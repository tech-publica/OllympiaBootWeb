package com.example.olympia.abstractions.services;

import com.example.olympia.entities.Reservation;

public interface ReservationService {
	Iterable<Reservation> list();

	void save(Reservation reservation);

	void update(Reservation reservation);
	
	Reservation reservationById(int id);

	void deleteCustomer(int id);
}
