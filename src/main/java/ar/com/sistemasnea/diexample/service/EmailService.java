package ar.com.sistemasnea.diexample.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("emailService")
@Primary
public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
