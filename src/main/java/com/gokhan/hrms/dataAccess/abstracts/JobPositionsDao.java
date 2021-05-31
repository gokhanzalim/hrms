package com.gokhan.hrms.dataAccess.abstracts;

import com.gokhan.hrms.entities.concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionsDao extends JpaRepository<JobPositions,Integer> {
    JobPositions getByName(String name);
}
