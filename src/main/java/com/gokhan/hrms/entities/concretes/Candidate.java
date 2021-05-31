package com.gokhan.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "candidates")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Candidate extends Users{

    @NotBlank(message = "First Name is mandatory")
    @Column(name="first_name")
    private String firstName;

    @NotBlank(message = "Last Name is mandatory")
    @Column(name="last_name")
    private String lastName;

    @NotBlank(message = "Birth Year is mandatory")
    @Column(name="birth_year")
    private String birthYear;

    @NotBlank(message = "Nationality number is mandatory")
    @Column(name="nationality_id")
    private String nationalityId;

}
