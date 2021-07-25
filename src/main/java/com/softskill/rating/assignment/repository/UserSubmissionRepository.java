package com.softskill.rating.assignment.repository;

import com.softskill.rating.assignment.models.UserSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSubmissionRepository extends JpaRepository<UserSubmission, Long> {
}
