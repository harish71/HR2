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

public class TestSch2 {

	private JavaMailSender javaMailSender;
	
	public void test() {
		System.out.println("@Scheduled(fixedRate = 24*60*60*1000,initialDelay = 5000)");
		MimeMessagePreparator mimeObject = new MimeMessagePreparator() {
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				mimeMessage.setRecipients(RecipientType.TO, "upendra.kris@gmail.com");
				mimeMessage.setSubject("Attachement subject");
				mimeMessage.setText("Text Tet");
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
				helper.addAttachment("ourFile", 
						new FileSystemResource(new File("E:\\files\\dev.jpg")));
			}
		};
		try {
		javaMailSender.send(mimeObject);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
