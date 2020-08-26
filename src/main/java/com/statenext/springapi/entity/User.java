package com.statenext.springapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private String name;
    private int age;

}
