package com.kingkonsole.eplmock.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.PreSave;


@Entity(value = "users", noClassnameStored = true)
public class User extends  BaseEntity{
    private String name;
    private String email;
    private String password;
    private String favoriteTeam;

    public User(){}

    @PreSave
    public void hasPassword(){
        this.password = this.password + "hashed";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    private Boolean isAdmin;
}
