package ar.com.sistemasnea.diexample.controller;

import ar.com.sistemasnea.diexample.database.DIDataStore;
import ar.com.sistemasnea.diexample.repositories.DiRepo;
import ar.com.sistemasnea.diexample.service.DiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiControllerTest {

    private DiController diController;
    private DiService diService;
    private DiRepo diRepo;
    private DIDataStore diDataStore;

    @BeforeEach
    void setup() {
        diDataStore = new DIDataStore("testUser", "testPassword", "testUrl");
        diRepo = new DiRepo(diDataStore);
        diService = new DiService(diRepo);
        diController = new DiController(diService);
    }

    @Test
    void getGreeting(){
        //Given
        String expectedGreeting = "hello world";

        //When
        String actualGreeting = diController.getGreeting();

        //Then
        assertEquals(expectedGreeting, actualGreeting);
    }
}
