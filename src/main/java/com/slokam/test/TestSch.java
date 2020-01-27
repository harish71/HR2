package com.slokam.test;

import java.io.File;

import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


public class TestSch {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Scheduled(fixedRate = 24*60*60*1000,initialDelay = 5000)
	public void test() {

		System.out.println("@Scheduled(fixedRate = 24*60*60*1000,initialDelay = 5000)");
		/*MimeMessageHelper mm  = new */
		MimeMessagePreparator mimeObject = new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				mimeMessage.setRecipients(RecipientType.TO, "upendra.kris@gmail.com");
				mimeMessage.setSubject("Attachement subject");
				mimeMessage.setText("asdfasdf asdfasf");
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
				
				  helper.setText("<html><body><img src='cid:abc'></body></html>", true);
				  
				  helper.addInline("abc", new FileSystemResource(new
				  File("E:\\files\\dev.jpg")));
				 
				//helper.setText("Hellooooo");
				helper.addAttachment("two", new FileSystemResource(new File("E:\\files\\abc.txt")));
			}
		};
		try {
		javaMailSender.send(mimeObject);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
