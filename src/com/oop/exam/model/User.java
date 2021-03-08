package com.oop.exam.model;

public class User {
    private String Username;
    private String mail;

    public User(String Username, String mail) {
        setUsername(Username);
        setMail(mail);
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
