package com.slokam.test.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("imports")
public class DataImportController {
	
	@Value("${app.upload.location}")
	private String uploadPath;
	@Autowired
	 private JavaMailSender  mailSender;
	@PostMapping("/Candidate")
	public ResponseEntity<String> uploadCandidate(MultipartFile multipartFile){
		
		System.out.println(multipartFile.getOriginalFilename());
		
		try {
			multipartFile.transferTo(new File(uploadPath+multipartFile.getOriginalFilename()));
			 SimpleMailMessage  mail=new SimpleMailMessage();
             mail.setTo("shiva2013to2017@gmail.com"); 
             mail.setFrom("shivaseternaluniverse@gmail.com");
             mail.setSubject("Test Subject");
             mail.setText("Hello Shivakumar, We are from Slokam you have Uploaded a File"); 
             mailSender.send(mail); 
			System.out.println("File Uploaded Successfully");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}

}
