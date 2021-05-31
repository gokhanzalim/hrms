package com.gokhan.hrms.business.abstracts;

import com.gokhan.hrms.core.utilities.DataResult;
import com.gokhan.hrms.core.utilities.Result;
import com.gokhan.hrms.entities.concretes.Candidate;
import com.gokhan.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    Result add(Employer Employer);
}
