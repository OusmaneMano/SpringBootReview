package com.ousmane.skillReview.service;

import com.ousmane.skillReview.entity.JobListing;
import com.ousmane.skillReview.entity.User;
import com.ousmane.skillReview.repository.JobListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobListingServiceImpl implements JobListingService{

    @Autowired
    private JobListingRepository jobRepo;

    @Override
    public List<JobListing> getByCompany(String company){
        return jobRepo.findByCompany(company);

    }
    @Override
    public List<JobListing> getByPublished(boolean published){
        return jobRepo.findByPublished(published);

    }
    @Override
    public List<JobListing> getByTitle(String keyword){
        return jobRepo.findByTitleContaining(keyword);

    }
    @Override
    public List<JobListing> getByUser(User user){
        return jobRepo.findByUser(user);
    }

    @Override
    public JobListing createJob(JobListing job){
        return jobRepo.save(job);
    }

    @Override
    public List<JobListing> getAll(){
        return jobRepo.findAll();
    }
    @Override
    public JobListing getById(Long id){
        return jobRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Not Found" +id));
    }
    @Override
    public JobListing updateJob(Long id, JobListing job){
        JobListing exist = getById(id);
        exist.setTitle(job.getTitle());
        exist.setDescription(job.getDescription());
        exist.setLocation(job.getLocation());
        exist.setSalary(job.getSalary());
        jobRepo.save(exist);

        return jobRepo.save(exist);

    }
    @Override
    public void deleteJob(Long id){
        jobRepo.deleteById(id);
    }
}
