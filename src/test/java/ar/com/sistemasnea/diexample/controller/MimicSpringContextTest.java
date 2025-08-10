package ar.com.sistemasnea.diexample.controller;

import ar.com.sistemasnea.diexample.database.DIDataStore;
import ar.com.sistemasnea.diexample.database.DataStore;
import ar.com.sistemasnea.diexample.repositories.DiRepoImpl;
import ar.com.sistemasnea.diexample.repositories.Repo;
import ar.com.sistemasnea.diexample.service.DiService;
import ar.com.sistemasnea.diexample.service.DiServiceImpl;
import ar.com.sistemasnea.diexample.service.EmailService;
import ar.com.sistemasnea.diexample.service.SmsService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MimicSpringContextTest {

    public static Map<String, Object> context = new HashMap<>();

    public static void addBean(String beanName, Object bean){
        context.put(beanName, bean);
    }

    public static Object getBean(String beanName) {
        return context.get(beanName);
    }

    @BeforeAll
    static void beforeAll() {
        addBean("dataStore", new DIDataStore("jt", "1234", "jdbc:mysql://localhost:3306/test"));
        addBean("repo", new DiRepoImpl(
                (DataStore) getBean("dataStore")
        ));
        addBean("diService", new DiServiceImpl((Repo) getBean("repo"), new EmailService(), new SmsService()));
        addBean( "diController", new DiController((DiService) getBean("diService")));
    }

    @Test
    void getControllerFromContext() {
        DiController controller = (DiController) getBean("diController");
        System.out.println(controller.getGreeting());
        assertEquals("Hello world", controller.getGreeting());
    }
}