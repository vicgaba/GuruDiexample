package ar.com.sistemasnea.diexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SpringContextTest {

    @Autowired
    DiController controller;

    @Test
    void testSpringController(){
        System.out.println(controller.getGreeting());
        assertEquals("Hello world", controller.getGreeting());
    }
}
