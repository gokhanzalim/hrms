package com.gokhan.hrms.dataAccess.abstracts;

import com.gokhan.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate,Integer> {
    Candidate getCandidateByEmailOrNationalityId(String email, String natId);
}
