package com.tatsam.hiring.assignment.service.user_submission;

import com.tatsam.hiring.assignment.models.UserSubmission;

import java.util.List;

public interface UserSubmissionService {
    List<UserSubmission> getSubmissions();
    List<UserSubmission> addSubmissions(List<UserSubmission> userSubmission);
}
