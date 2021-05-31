package com.gokhan.hrms.business.concretes;

import com.gokhan.hrms.business.abstracts.CandidateService;
import com.gokhan.hrms.core.utilities.*;
import com.gokhan.hrms.core.utilities.adapters.abstracts.MernisAdapter;
import com.gokhan.hrms.dataAccess.abstracts.CandidateDao;
import com.gokhan.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CandidateManager implements CandidateService {

    @Autowired
    private CandidateDao candidateDao;

    @Autowired
    @Qualifier(value = "mernisManager")
    private MernisAdapter mernisAdapter;

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<>(candidateDao.findAll(),"Successfully listed");
    }

    @Override
    public Result add(Candidate candidate) throws Exception {
        Candidate candidateInDb = candidateDao.getCandidateByEmailOrNationalityId(candidate.getEmail(),
                candidate.getNationalityId());
        if (mernisAdapter.isNatIdValid(candidate) || Objects.isNull(candidateInDb)) {
            candidateDao.save(candidate);
            return new SuccessResult("The candidate added.");
        }
        return new ErrorResult("Candidate mernis info not valid.");
    }
}
