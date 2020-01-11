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
<<<<<<< HEAD
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
=======
@RequestMapping("import")
public class DataImportController {

	@Value("${app.upload.location}")
	private String uploadPath;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@PostMapping("/candidate")
	public ResponseEntity<String> uploadCandidate(MultipartFile multipartFile){
		System.out.println(multipartFile.getOriginalFilename());
		try {
			multipartFile.transferTo(new File(uploadPath+multipartFile.getOriginalFilename()));
			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setTo("upendra.kris@gmail.com");
			mail.setFrom("slokam.resume@gmail.com");
			mail.setSubject("Test Subject");
			mail.setText("sample data from slokam");
			mailSender.send(mail);
			// 1.upload  into speicified folder
			// 2.validations
			// 3.saving submission details// accepted
			// should run in thread
			// 4.Reading the data.:
			    // a. text
			    // b. excel
			    // c. excelx
			    // d. xml 
			// 5.update submission  details // in progress
			// 6. save database
			// 7. update submission details // //paritially success or fail
			// 8. completed details of submission.
			// 9. notifications through mail. 
			System.out.println("UploadCandidate.");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}

>>>>>>> e3af983130e6525ea95b0e29b87f3ab15cd71251
