package com.gepardec.model;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String firstname;
    private String lasttname;
    private String email;
    private String Avatar;

    public User() {
    }

    public User(int id, String firstname, String lasttname, String email, String avatar) {
        this.id = id;
        this.firstname = firstname;
        this.lasttname = lasttname;
        this.email = email;
        Avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        Avatar = avatar;
    }
}
