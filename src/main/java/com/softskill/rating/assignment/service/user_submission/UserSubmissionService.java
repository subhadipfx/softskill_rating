package com.softskill.rating.assignment.service.user_submission;

import com.softskill.rating.assignment.models.UserSubmission;

import java.util.List;

public interface UserSubmissionService {
    List<UserSubmission> getSubmissions();
    List<UserSubmission> addSubmissions(List<UserSubmission> userSubmission);
}
