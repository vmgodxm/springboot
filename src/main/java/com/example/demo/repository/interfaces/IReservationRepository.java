package com.example.demo.repository.interfaces;

import com.example.demo.model.Reservation;

public interface IReservationRepository {
	
	Reservation getResvation(Long resNo) throws Exception;

}