package ar.com.sistemasnea.diexample.controller;

import ar.com.sistemasnea.diexample.database.DIDataStore;
import ar.com.sistemasnea.diexample.database.DataStore;
import ar.com.sistemasnea.diexample.repositories.DiRepoImpl;
import ar.com.sistemasnea.diexample.repositories.Repo;
import ar.com.sistemasnea.diexample.service.DiServiceImpl;
import ar.com.sistemasnea.diexample.service.DiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiControllerTest {

    private DiController diController;
    private DiService diService;
    private Repo diRepo;
    private DataStore diDataStore;

    @BeforeEach
    void setup() {
        diDataStore = new DIDataStore("testUser", "testPassword", "testUrl");
        diRepo = new DiRepoImpl(diDataStore);
        diService = new DiServiceImpl(diRepo);
        diController = new DiController(diService);
    }

    @Test
    void getGreeting(){
        //Given
        String expectedGreeting = "Hello world";

        //When
        String actualGreeting = diController.getGreeting();

        //Then
        assertEquals(expectedGreeting, actualGreeting);
    }
}
