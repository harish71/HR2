package com.slokam.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.test.entity.Shortlisted;
import com.slokam.test.service.ShortlistedService;

@RestController
@RequestMapping("Shortlisted") 
public class ShortlistedController {
	 @Autowired
	 private ShortlistedService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Shortlisted>	 saveShortlisted(@RequestBody Shortlisted obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Shortlisted>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Shortlisted>	 deleteShortlisted(@RequestBody Shortlisted obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Shortlisted>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Shortlisted>> getAllShortlisted(){
		 List<Shortlisted> list = service.getAll();
		 return new ResponseEntity<List<Shortlisted>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/id")
	 public ResponseEntity<Shortlisted> getByIdShortlisted(Integer id) {
		  Shortlisted obj =  service.getById(id);
		  return new ResponseEntity<Shortlisted>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Shortlisted>	 
	 deleteShortlisted(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Shortlisted>(HttpStatus.OK);
	 }
}

