package com.gokhan.hrms.business.abstracts;

import com.gokhan.hrms.core.utilities.DataResult;
import com.gokhan.hrms.core.utilities.Result;
import com.gokhan.hrms.entities.concretes.JobPositions;

import java.util.List;

public interface JobPositionsService {
    DataResult<List<JobPositions>> getAll();
    Result add(JobPositions jobPositions);
}
