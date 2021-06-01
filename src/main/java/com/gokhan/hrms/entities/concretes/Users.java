package com.gokhan.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotBlank(message = "Email Year is mandatory")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "Password Year is mandatory")
    @Column(name = "password")
    private String password;

    @Column(name = "password_again")
    private String passwordAgain;

}
