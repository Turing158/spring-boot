package com.starfall.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(nullable = false,unique = true,name = "user")
    private String user;
    @Column(nullable = false,name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "date")
    private String date;
    @Column(name = "level")
    private int level;
    @Column(name = "introduce")
    private String introduce;
    @Column(nullable = false,unique = true,name = "email")
    private String email;
    @Column(name = "head")
    private String head;
}
