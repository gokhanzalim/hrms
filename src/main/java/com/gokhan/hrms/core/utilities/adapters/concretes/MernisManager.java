package com.gokhan.hrms.core.utilities.adapters.concretes;

import com.gokhan.hrms.core.utilities.adapters.abstracts.MernisAdapter;
import com.gokhan.hrms.entities.concretes.Candidate;
import com.gokhan.hrms.external.mernis.JDFKPSPublicSoap;
import org.springframework.stereotype.Component;

@Component
public class MernisManager implements MernisAdapter {

    @Override
    public Boolean isNatIdValid(Candidate candidate) throws Exception {
        JDFKPSPublicSoap jdfkpsPublicSoap = new JDFKPSPublicSoap();
        return jdfkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(candidate.getNationalityId()),
                candidate.getFirstName(),candidate.getLastName(), Integer.valueOf(candidate.getBirthYear()));
    }
}
