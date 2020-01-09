package com.slokam.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.hr.entity.InteviewLevel;
import com.slokam.hr.service.InteviewLevelService;

@RestController
@RequestMapping("InteviewLevel") 
public class InteviewLevelController {
	 @Autowired
	 private InteviewLevelService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<InteviewLevel>	 saveInteviewLevel(@RequestBody InteviewLevel obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<InteviewLevel>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<InteviewLevel>	 deleteInteviewLevel(@RequestBody InteviewLevel obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<InteviewLevel>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<InteviewLevel>> getAllInteviewLevel(){
		 List<InteviewLevel> list = service.getAll();
		 return new ResponseEntity<List<InteviewLevel>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/id")
	 public ResponseEntity<InteviewLevel> getByIdInteviewLevel(Integer id) {
		  InteviewLevel obj =  service.getById(id);
		  return new ResponseEntity<InteviewLevel>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<InteviewLevel>	 
	 deleteInteviewLevel(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<InteviewLevel>(HttpStatus.OK);
	 }
}

