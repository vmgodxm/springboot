package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.CustomerReservation;
import com.example.demo.model.Reservation;
import com.example.demo.model.ReservationSelector;
import com.example.demo.model.UserReservation;

public interface IReservationRepository {
	List<CustomerReservation> getReservationCollectionSelectionMonth(ReservationSelector selector) throws Exception;
	List<CustomerReservation> getReservationCollectionSelectionDate(Reservation reservation) throws Exception;
	Reservation getReservation(String userId) throws Exception;
	UserReservation getUserReservation(String userId) throws Exception;
	int insertReservation(Reservation reservation) throws Exception;
	int updateReservation(Long resNo) throws Exception;
	int deleteReservation(Long resNo) throws Exception;
}