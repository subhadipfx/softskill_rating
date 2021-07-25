package com.tatsam.hiring.assignment.repository;

import com.tatsam.hiring.assignment.models.UserSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSubmissionRepository extends JpaRepository<UserSubmission, Long> {
}
