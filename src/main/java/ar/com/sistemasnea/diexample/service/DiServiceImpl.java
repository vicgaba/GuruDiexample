package ar.com.sistemasnea.diexample.service;

import ar.com.sistemasnea.diexample.repositories.Repo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DiServiceImpl implements DiService {

    private final Repo repo;
    private final MessageService emailService;
    private final MessageService smsService;

    public DiServiceImpl(Repo repo,
                         @Qualifier("emailService") MessageService emailService,
                         @Qualifier("smsService") MessageService smsService) {
        this.repo = repo;
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public String getGreeting(){
        String greeting = repo.queryDatabase();
        emailService.sendMessage(greeting);
        smsService.sendMessage(greeting);
        return greeting;
    }
}
