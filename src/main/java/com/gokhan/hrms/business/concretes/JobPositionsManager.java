package com.gokhan.hrms.business.concretes;

import com.gokhan.hrms.business.abstracts.JobPositionsService;
import com.gokhan.hrms.core.utilities.*;
import com.gokhan.hrms.dataAccess.abstracts.JobPositionsDao;
import com.gokhan.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionsManager implements JobPositionsService {

    @Autowired
    private JobPositionsDao jobPositionsDao;

    @Override
    public DataResult<List<JobPositions>> getAll() {
        return new SuccessDataResult<>(jobPositionsDao.findAll(),"İş pozisyonları listelendi.");
    }

    @Override
    public Result add(JobPositions jobPositions) {
        JobPositions jobPositionsDaoByName = jobPositionsDao.getByName(jobPositions.getName());
        if (jobPositionsDaoByName != null)
           return new ErrorDataResult<>("The job positions already exists!");

        jobPositionsDao.save(jobPositions);
        return new SuccessResult("The job positions added");
    }
}
