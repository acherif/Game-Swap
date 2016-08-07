package com.example.hamid.sharevid.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamid on 26/06/2016.
 */
public class UserObject {
    private String firstName;
    private String lastName;
    private String email;
    private String adress;
    private double score;

    private int photo;

    private String password;

    private List<GameObject> games;

    public UserObject(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.games = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<GameObject> getGames() {
        return games;
    }

    public void setGames(List<GameObject> games) {
        this.games = games;
    }
}
