package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hairgram.model.Reservation;
import com.hairgram.service.interfaces.IReservationService;

@Controller
public class ReservationController {

	@Autowired
	private IReservationService service;
	
	@RequestMapping(value = "reservation")
	public String getRes(@RequestParam(required = true, defaultValue = "1")Long resNo, Model model) throws Exception {
		Reservation reservation = service.getRes(resNo);
		model.addAttribute("reservation", reservation);
		return "reservation";
	}
}
