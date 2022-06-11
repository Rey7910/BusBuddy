package com.unal.busbuddy.model;

import java.util.Date;

public class User {
    private int idUser;
    private String nickname, firstName, lastName, email, password;
    private long telNumber;
    private Date birthDate;
    //declaración variable para foto   
    
    public User(int idUser, String nickname, String firstName, String lastName, String email, String password, long telNumber, Date birthDate){
        super();
        this.idUser = idUser;
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.telNumber = telNumber;
        this.birthDate = birthDate;

    }

    //GETTERS
    public int getIdUser(){
        return this.idUser;
    }

    public String getNickname(){
        return this.nickname;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public long getTelNumber(){
        return this.telNumber;
    }

    public Date getBirthDate(){
        return this.birthDate;
    }

    //SETTERS
    public void setIdUser(int idUser){
        this.idUser = idUser;
        return;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
        return;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
        return;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
        return;
    }

    public void setEmail(String email){
        this.email = email;
        return;
    }

    public void setPassword(String password){
        this.password = password;
        return;
    }

    public void setTelNumber(long telNumber){
        this.telNumber = telNumber;
        return;
    }

    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
        return;
    }

}
