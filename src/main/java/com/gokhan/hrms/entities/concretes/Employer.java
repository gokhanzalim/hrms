package com.gokhan.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employer extends Users{

    @NotBlank(message = "Company Name is mandatory")
    @Column(name="company_name")
    private String companyName;

    @NotBlank(message = "Web Address is mandatory")
    @Column(name="web_address")
    private String webAddress;

    @Column(name="phone_number")
    private String phoneNumber;

}
