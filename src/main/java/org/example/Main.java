package org.example;

import com.sun.mail.util.logging.MailHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.mail.MessagingException;

@SpringBootApplication
public class Main {
    public static void main(String[] args){

        SpringApplication.run(Main.class,args);


        //System.out.println("Starting to send mail...");

        //MailHandlerBase mailHandler = new MailHandlerBase();
        //mailHandler.sendMail();

    }
}