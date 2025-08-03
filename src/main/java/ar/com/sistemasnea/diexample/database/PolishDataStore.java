
package ar.com.sistemasnea.diexample.database;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("polish")
public class PolishDataStore implements DataStore{
    private String user;
    private String password;
    private String url;

    public PolishDataStore(@Value("jt") String user,
                           @Value("1234") String password,
                           @Value("jdbc:mysql://localhost:3306/test") String url){
        this.user =user;
        this.password =password;
        this.url =url;
    }
    public String queryDatabase() {
        return "witaj świecie";
    }
}