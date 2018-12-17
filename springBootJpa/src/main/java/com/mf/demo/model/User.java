package com.mf.demo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "user")
@Entity
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", columnDefinition = "名称")
    private String name;


    protected User() {}

    public User(int firstName, String lastName) {
        this.id = firstName;
        this.name = lastName;
    }
}