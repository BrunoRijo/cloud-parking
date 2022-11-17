package com.dio.cloudparking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.cloudparking.model.Parking;
import com.dio.cloudparking.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {
	
	@Autowired
	private final ParkingService parkingService;
	
	public ParkingController(ParkingService parkingService) {
		this.parkingService = parkingService;
	}

	@GetMapping
	public List<Parking> findAll(){
		return parkingService.findAll();
	}
}
