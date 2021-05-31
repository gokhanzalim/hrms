package com.gokhan.hrms.business.concretes;

import com.gokhan.hrms.business.abstracts.EmployerService;
import com.gokhan.hrms.core.utilities.*;
import com.gokhan.hrms.dataAccess.abstracts.EmployerDao;
import com.gokhan.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private EmployerDao employerDao;

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(employerDao.findAll(),"Successfully listed");
    }

    @Override
    public Result add(Employer employer){
        Employer employerInDb = employerDao.getEmployerByEmail(employer.getEmail());
        if (Objects.isNull(employerInDb)) {
            employerDao.save(employer);
            return new SuccessResult("The Employer added.");
        }
        return new ErrorResult("Employer email already exists.");
    }
}
