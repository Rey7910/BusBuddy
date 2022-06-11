package com.unal.busbuddy.model;

import java.util.Date;

public class User {
    private int idUser;
    private String nickname, firstName, lastName, email;
    private long telNumber;
    private Date birthDate;
    //declaración variable para foto   
    
    public User(int idUser, String nickname, String firstName, String lastName, String email, long telNumber, Date birthDate){
        super();
        this.idUser = idUser;
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telNumber = telNumber;
        this.birthDate = birthDate;

    }

    public int idUser(){
        return this.idUser;
    }

    public String nickname(){
        return this.nickname;
    }

    public String firstName(){
        return this.firstName;
    }

    public String lastName(){
        return this.lastName;
    }

    public String email(){
        return this.email;
    }

}
