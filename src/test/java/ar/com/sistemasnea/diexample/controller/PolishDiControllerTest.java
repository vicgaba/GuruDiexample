package ar.com.sistemasnea.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ar.com.sistemasnea.diexample.controller.DiController;

@SpringBootTest
@ActiveProfiles("polish")
public class PolishDiControllerTest {

    @Autowired
    private DiController diController;

    @Test
    void testSpringControllerPolish(){

        String greeting = diController.getGreeting();
        assertEquals("witaj świecie", greeting);
    }
}