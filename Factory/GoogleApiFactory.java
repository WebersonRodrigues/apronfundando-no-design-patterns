package Factory;

import service.GoogleApi;

public class GoogleApiFactory {
    
    private GoogleApi googleApi;

    private String email;

    private String password;

    private String keysecret;

    private String token;

    public GoogleApiFactory(){
        this.email = ""; // Pegando de application.properties
        this.password = "";
        this.keysecret = "";
        this.token = "";
    }

    public GoogleApi getGoogleApi(){
        return new GoogleApi(email, password, keysecret, token);
    }
}
