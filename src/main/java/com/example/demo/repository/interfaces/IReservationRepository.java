package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.CustomerReservation;
import com.example.demo.model.Reservation;

public interface IReservationRepository {
	List<CustomerReservation> getReservationCollection(Reservation reservation) throws Exception;
	Reservation getReservation(Reservation reservation) throws Exception;
	int insertReservation(Reservation reservation) throws Exception;
	int updateReservation(Long resNo) throws Exception;
	int deleteReservation(Long resNo) throws Exception;
}