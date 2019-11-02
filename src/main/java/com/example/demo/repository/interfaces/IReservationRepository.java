package com.example.demo.repository.interfaces;

import com.hairgram.model.Reservation;

public interface IReservationRepository {
	
	Reservation getResvation(Long resNo) throws Exception;

}