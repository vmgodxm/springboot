package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.CustomerReservation;
import com.example.demo.model.Reservation;
import com.example.demo.repository.interfaces.IReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

	@Autowired
	private IReservationRepository repository;
	
	@GetMapping(path = "/reservation/{designerId}/resDate/{resDate}")
	public ResponseEntity<List<CustomerReservation>> getReservationCollection(@PathVariable String designerId, @PathVariable String resDate) throws Exception {
		ResponseEntity<List<CustomerReservation>> retVal = null;

		if(resDate == null || designerId == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Reservation reservation = new Reservation(resDate, designerId, 0);

		try {
			List<CustomerReservation> result = repository.getReservationCollection(reservation);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}
	
	@GetMapping(path = "/reservation/{userId}/designer/{designerId}")
	public ResponseEntity<Reservation> getReservation(@PathVariable String userId, @PathVariable String designerId) throws Exception {
		ResponseEntity<Reservation> retVal = null;

		if(userId == null || designerId == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Reservation reservation = new Reservation(designerId, userId);
		try {
			Reservation result = repository.getReservation(reservation);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}
	
	@PostMapping(path="/reservation")
	public ResponseEntity<Integer> insertReservation (HttpEntity<Reservation> httpEntity) throws Exception{
		ResponseEntity<Integer> retVal = null;

		Reservation body = httpEntity.getBody();
		if(body == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		try {
			Integer result = repository.insertReservation(body);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}
	
	@PutMapping(path="/reservation/{resNo}")
	public ResponseEntity<Integer> updateReservationUseComplete (@PathVariable Long resNo) throws Exception{
		ResponseEntity<Integer> retVal = null;

		if(resNo == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		try {
			Integer result = repository.updateReservation(resNo);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch(Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}
	
	@DeleteMapping(path="/reservation/{resNo}")
	public ResponseEntity<Integer> daleteReservation(@PathVariable Long resNo) throws Exception{
		ResponseEntity<Integer> retVal = null;

		if(resNo == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		try {
			Integer result = repository.deleteReservation(resNo);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch(Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}
	
}
