package com.gokhan.hrms.api.controllers;

import com.gokhan.hrms.business.abstracts.CandidateService;
import com.gokhan.hrms.business.abstracts.JobPositionsService;
import com.gokhan.hrms.core.utilities.DataResult;
import com.gokhan.hrms.core.utilities.Result;
import com.gokhan.hrms.entities.concretes.Candidate;
import com.gokhan.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/getall")
    public DataResult<List<Candidate>> getAll(){
        return candidateService.getAll();
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody Candidate candidate) throws Exception {
        return candidateService.add(candidate);
    }
}
