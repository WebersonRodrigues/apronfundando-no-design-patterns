package service;

import java.util.ArrayList;
import java.util.List;

public class GoogleApi {
    
    private String email;

    private String password;

    private String keysecret;

    private String token;


    public GoogleApi(String email, String password, String keysecret, String token) {
        this.email = email;
        this.password = password;
        this.keysecret = keysecret;
        this.token = token;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKeysecret() {
        return keysecret;
    }

    public void setKeysecret(String keysecret) {
        this.keysecret = keysecret;
    }

    // Simulando a obtenção dos agendamentos
    public List<String> getSchedules(){

        List<String> schedules = new ArrayList<>();

        schedules.add("Agendamento 1");
        schedules.add("Agendamento 2");

        return schedules;
    }

     // Simulando a obtenção dos contatos
    public List<String> getContacts(){

        List<String> contacts = new ArrayList<>();

        contacts.add("Contato 1");
        contacts.add("Contato 2");

        return contacts;
    }
}
