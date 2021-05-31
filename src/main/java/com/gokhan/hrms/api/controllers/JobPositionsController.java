package com.gokhan.hrms.api.controllers;

import com.gokhan.hrms.business.abstracts.JobPositionsService;
import com.gokhan.hrms.core.utilities.DataResult;
import com.gokhan.hrms.core.utilities.Result;
import com.gokhan.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/jobpositons")
public class JobPositionsController {

    @Autowired
    private JobPositionsService jobPositionsService;

    @GetMapping("/getall")
    public DataResult<List<JobPositions>> getAll(){
        return jobPositionsService.getAll();
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody JobPositions jobPositions){
        return jobPositionsService.add(jobPositions);
    }
}
