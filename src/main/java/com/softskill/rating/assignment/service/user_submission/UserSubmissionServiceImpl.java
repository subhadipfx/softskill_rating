package com.softskill.rating.assignment.service.user_submission;

import com.softskill.rating.assignment.models.UserSubmission;
import com.softskill.rating.assignment.repository.UserSubmissionRepository;
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
