package com.hackerrank.github.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Actor {

	@Id
	private Long id;
    
	private String login;

    private String avatar_url;

    public Actor() {
    }

    public Actor(Long id, String login, String avatar) {
        this.id = id;
        this.login = login;
        this.avatar_url = avatar;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getAvatar_url() {
        return avatar_url;
    }
    
    public void setAvatar_url(String avatar) {
        this.avatar_url = avatar;
    }
}
