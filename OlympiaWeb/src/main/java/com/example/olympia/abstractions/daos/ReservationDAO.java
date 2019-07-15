package com.example.olympia.abstractions.daos;

import com.example.olympia.entities.Reservation;

public interface ReservationDAO {
    Iterable<Reservation> allReservations();
    Reservation add(Reservation newReservation);
    Reservation update(Reservation newReservation);
    Reservation delete (int idReservation);
    Reservation findById(int id);
}
