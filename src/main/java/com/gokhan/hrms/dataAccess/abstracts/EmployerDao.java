package com.gokhan.hrms.dataAccess.abstracts;

import com.gokhan.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
    Employer getEmployerByEmail(String email);
}
