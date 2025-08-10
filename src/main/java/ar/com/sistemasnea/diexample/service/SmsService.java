package ar.com.sistemasnea.diexample.service;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
