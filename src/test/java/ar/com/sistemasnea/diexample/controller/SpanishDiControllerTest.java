package ar.com.sistemasnea.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ar.com.sistemasnea.diexample.controller.DiController;

@SpringBootTest
@ActiveProfiles("spanish")
public class SpanishDiControllerTest {

    @Autowired
    private DiController diController;

    @Test
    void testSpringControllerSpanish(){

        String greeting = diController.getGreeting();
        assertEquals("Hola mundo", greeting);
    }
}