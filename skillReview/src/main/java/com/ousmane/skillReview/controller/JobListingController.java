package com.ousmane.skillReview.controller;

import com.ousmane.skillReview.entity.JobListing;
import com.ousmane.skillReview.service.JobListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobListingController {

    @Autowired
    public JobListingService jobSer;

    @PostMapping
    public ResponseEntity<JobListing> createJob(@RequestBody JobListing jobs){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(jobSer.createJob(jobs));
    }
    @GetMapping
    public ResponseEntity<List<JobListing>> GetAllJob(){
        return ResponseEntity.ok(jobSer.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<JobListing> getById(@PathVariable Long id){
        return ResponseEntity.ok(jobSer.getById(id));
    }
    @PutMapping("/update")
    public ResponseEntity<JobListing> update(@PathVariable Long id,
                                             @RequestBody JobListing jobs){
        return ResponseEntity.ok(jobSer.updateJob(id, jobs));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
       jobSer.deleteJob(id);
       return ResponseEntity.noContent().build();
    }
}
