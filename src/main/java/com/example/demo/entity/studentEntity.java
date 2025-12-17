package com.example.demo.entity;

import jakarta.persistence.*;

public class studentEntity{
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Email(message= "Email Format is not Valid")
    @NotBlank(message = "")
    private String email;

     
}