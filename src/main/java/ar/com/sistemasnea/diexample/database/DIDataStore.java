package ar.com.sistemasnea.diexample.database;

public class DIDataStore {
    private String user;
    private String password;
    private String url;

    public DIDataStore(String user, String password, String url){
        this.user = user;
        this.password = password;
        this.url = url;
    }

    public String queryDatabase() {
        return "Hello world";
    }
}
