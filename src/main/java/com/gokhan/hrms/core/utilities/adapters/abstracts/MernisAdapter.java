package com.gokhan.hrms.core.utilities.adapters.abstracts;

import com.gokhan.hrms.entities.concretes.Candidate;

public interface MernisAdapter {
    Boolean isNatIdValid(Candidate candidat) throws Exception;
}
