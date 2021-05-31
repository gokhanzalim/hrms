package com.gokhan.hrms.business.abstracts;

import com.gokhan.hrms.core.utilities.DataResult;
import com.gokhan.hrms.core.utilities.Result;
import com.gokhan.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
    Result add(Candidate candidate) throws Exception;
}
