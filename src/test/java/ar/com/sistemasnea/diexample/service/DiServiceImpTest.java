package ar.com.sistemasnea.diexample.service;

import ar.com.sistemasnea.diexample.repositories.Repo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DiServiceImpTest {

    @Mock
    private Repo repo;

    @Spy
    private EmailService emailService;

    @Spy
    private SmsService smsService;

    private DiServiceImpl diService;

    @BeforeEach
    void setUp() {
        diService = new DiServiceImpl(repo, emailService, smsService);
    }

    @Test
    void testGetGreeting() {
        //Given
        String expectedGreeting =  "Hello World";
        when(repo.queryDatabase()).thenReturn(expectedGreeting);

        //When
        String actualString = diService.getGreeting();

        //Then
        assertEquals(expectedGreeting, actualString);
        verify(repo, times(1)).queryDatabase();
        verify(emailService, times(1)).sendMessage(expectedGreeting);
        verify(smsService, times(1)).sendMessage(expectedGreeting);
    }
}
