package com.ousmane.skillReview.repository;

import com.ousmane.skillReview.entity.JobListing;
import com.ousmane.skillReview.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobListingRepository extends JpaRepository<JobListing, Long> {

        List<JobListing> findByCompany(String company);
        List<JobListing> findByPublished(boolean published);
        List<JobListing> findByTitleContaining(String keyword);
        List<JobListing> findByUser(User user); // ← all jobs by a specific user

}
