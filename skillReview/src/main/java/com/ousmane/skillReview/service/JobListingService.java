package com.ousmane.skillReview.service;

import com.ousmane.skillReview.entity.JobListing;
import com.ousmane.skillReview.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobListingService {

    List<JobListing> getByCompany(String company);
    List<JobListing> getByPublished(boolean published);
    List<JobListing> getByTitle(String keyword);
    List<JobListing> getByUser(User user);
    JobListing createJob(JobListing job);
    List<JobListing> getAll();
    JobListing getById(Long id);
    JobListing updateJob(Long id, JobListing job);
    void deleteJob(Long id);

}
