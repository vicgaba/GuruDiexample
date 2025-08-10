// src/main/java/ar/com/sistemasnea/diexample/database/SpanishDataStore.java
package ar.com.sistemasnea.diexample.database;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
@Profile("spanish")
public class SpanishDataStore implements DataStore{
    private String user;
    private String password;
    private String url;

    public SpanishDataStore(@Value("${guru.sfg.user}") String user,
                            @Value("${guru.sfg.password}") String password,
                            @Value("${guru.sfg.url}") String url){
        this.user =user;
        this.password =password;
        this.url =url;
    }
    public String queryDatabase() {
        return "Hola mundo";
    }
}