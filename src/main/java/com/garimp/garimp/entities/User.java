package com.garimp.garimp.entities;


import java.time.Instant;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    
    @Column
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthdate;

    @Column
    private String email;

    @Column
    private String cpf;

    @Column
    private String password;

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

/*
 * id int AI PK
 * firstname text
 * lastname text
 * birthdate datetime
 * email text
 * cpf varchar(11)
 * password text
 */