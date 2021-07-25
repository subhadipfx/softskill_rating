package com.tatsam.hiring.assignment.service.user_submission;

import com.tatsam.hiring.assignment.models.UserSubmission;
import com.tatsam.hiring.assignment.repository.UserSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserSubmissionServiceImpl implements UserSubmissionService {

    @Autowired
    private UserSubmissionRepository userSubmissionRepository;

    @Override
    public List<UserSubmission> getSubmissions() {
        return userSubmissionRepository.findAll();
    }

    @Override
    @Transactional
    public List<UserSubmission> addSubmissions(List<UserSubmission> userSubmission) {
        return userSubmissionRepository.saveAll(userSubmission);
    }
}
