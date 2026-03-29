package com.prathamesh.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String name, String email, String message){

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("kakdeprathamesh860@gmail.com");
        mail.setSubject("New Contact Form Submission");

        mail.setText(
                "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Message: " + message
        );

        mailSender.send(mail);
    }
}
