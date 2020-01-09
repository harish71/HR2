package com.slokam.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.hr.entity.Location;
import com.slokam.hr.service.LocationService;

@RestController
@RequestMapping("Location") 
public class LocationController {
	 @Autowired
	 private LocationService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Location>	 saveLocation(@RequestBody Location obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Location>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Location>	 deleteLocation(@RequestBody Location obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Location>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Location>> getAllLocation(){
		 List<Location> list = service.getAll();
		 return new ResponseEntity<List<Location>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/id")
	 public ResponseEntity<Location> getByIdLocation(Integer id) {
		  Location obj =  service.getById(id);
		  return new ResponseEntity<Location>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Location>	 
	 deleteLocation(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Location>(HttpStatus.OK);
	 }
}

