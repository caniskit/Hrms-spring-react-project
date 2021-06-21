package io.kodlama.hrmsspringboot.api.controller;

import io.kodlama.hrmsspringboot.business.abstracts.JobPositionService;
import io.kodlama.hrmsspringboot.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getall")
    public List<JobPosition> getAll(){
        return this.jobPositionService.getAll();
    }

    @GetMapping("/get/{id}")
    public JobPosition getById(@PathVariable int id){
        return this.jobPositionService.getById(id);
    }
}
