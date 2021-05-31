package com.gokhan.hrms.core.utilities.adapters.concretes;

import com.gokhan.hrms.core.utilities.adapters.abstracts.MernisAdapter;
import com.gokhan.hrms.entities.concretes.Candidate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MernisLocalManager implements MernisAdapter {
    @Override
    public Boolean isNatIdValid(Candidate candidate) throws Exception {
        return true;
    }
}
