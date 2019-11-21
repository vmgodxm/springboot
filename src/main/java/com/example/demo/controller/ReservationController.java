package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.CustomerReservation;
import com.example.demo.model.Reservation;
import com.example.demo.model.ReservationSelector;
import com.example.demo.model.UserReservation;
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

	/**
	 * 디자이너 예약현황에서 해당되는 월의 예약 정보들을 가져온다.
	 */
	@GetMapping(path = "/reservation/{designerId}/month/{month}")
	public ResponseEntity<List<CustomerReservation>> getReservationCollectionSelectionMonth(
			@PathVariable String designerId, @PathVariable int month) throws Exception {
		ResponseEntity<List<CustomerReservation>> retVal = null;

		if (month < 1 || 12 < month || designerId == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		ReservationSelector selector = new ReservationSelector(designerId, month);

		try {
			List<CustomerReservation> result = repository.getReservationCollectionSelectionMonth(selector);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}

	/**
	 * 디자이너가 선택한 날짜의 예약 정보들을 가져온다.
	 */
	@GetMapping(path = "/reservation/{designerId}/date/{date}")
	public ResponseEntity<List<CustomerReservation>> getReservationCollectionSelectionDate(
			@PathVariable String designerId, @PathVariable String date) throws Exception {
		ResponseEntity<List<CustomerReservation>> retVal = null;

		if (date == null || designerId == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Reservation reservation = new Reservation(date, designerId, 0);

		try {
			List<CustomerReservation> result = repository.getReservationCollectionSelectionDate(reservation);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}

	@GetMapping(path = "/reservation/{userId}")
	public ResponseEntity<Reservation> getReservation(@PathVariable String userId) throws Exception {
		ResponseEntity<Reservation> retVal = null;

		if (userId == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		try {
			Reservation result = repository.getReservation(userId);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}

	@PostMapping(path = "/reservation")
	public ResponseEntity<Integer> insertReservation(HttpEntity<Reservation> httpEntity) throws Exception {
		ResponseEntity<Integer> retVal = null;

		Reservation body = httpEntity.getBody();
		if (body == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		try {
			int resNo = repository.checkReservation(body.getUserId());
			if (resNo > 0) {
				retVal = new ResponseEntity<>(HttpStatus.CONFLICT);
			} else {
				Integer result = repository.insertReservation(body);
				retVal = new ResponseEntity<>(result, HttpStatus.OK);
			}
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}

	@PutMapping(path = "/reservation/{resNo}")
	public ResponseEntity<Integer> updateReservationUseComplete(@PathVariable Long resNo) throws Exception {
		ResponseEntity<Integer> retVal = null;

		if (resNo == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		try {
			Integer result = repository.updateReservation(resNo);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}

	@DeleteMapping(path = "/reservation/{resNo}")
	public ResponseEntity<Integer> daleteReservation(@PathVariable Long resNo) throws Exception {
		ResponseEntity<Integer> retVal = null;

		if (resNo == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		try {
			Integer result = repository.deleteReservation(resNo);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}

	@GetMapping(path = "/reservation/{userId}/all")
	public ResponseEntity<UserReservation> getUserReservertion(@PathVariable String userId) throws Exception {

		ResponseEntity<UserReservation> retVal = null;

		if (userId == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		try {
			UserReservation result = repository.getUserReservation(userId);
			retVal = new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return retVal;
	}
}
