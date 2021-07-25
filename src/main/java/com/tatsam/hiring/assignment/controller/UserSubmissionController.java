package com.tatsam.hiring.assignment.controller;

import com.tatsam.hiring.assignment.dto.UserSubmissionDTO;
import com.tatsam.hiring.assignment.models.Area;
import com.tatsam.hiring.assignment.models.User;
import com.tatsam.hiring.assignment.models.UserSubmission;
import com.tatsam.hiring.assignment.service.area.AreaService;
import com.tatsam.hiring.assignment.service.user.UserService;
import com.tatsam.hiring.assignment.service.user_submission.UserSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user-submission")
public class UserSubmissionController {

    @Autowired
    private UserSubmissionService userSubmissionService;

    @Autowired
    private UserService userService;

    @Autowired
    private AreaService areaService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<UserSubmission> getSubmissions(){
        return userSubmissionService.getSubmissions();
    }


    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public List<UserSubmission> addSubmissions(@RequestBody List<UserSubmissionDTO> userSubmissionList){
        List<UserSubmission> userSubmissions = new ArrayList<>();

        for(UserSubmissionDTO userSubmissionDTO : userSubmissionList){
            Optional<User> user = userService.getUser(userSubmissionDTO.getUser_id());
            Optional<Area> area = areaService.getArea(userSubmissionDTO.getArea_id());

            if(user.isEmpty() || area.isEmpty()) continue;

            UserSubmission userSubmission = new UserSubmission();
            user.ifPresent(userSubmission::setUser);
            area.ifPresent(userSubmission::setArea);
            userSubmission.setPriority(userSubmissionDTO.getPriority());
            userSubmission.setSatisfaction(userSubmissionDTO.getSatisfaction());

            userSubmissions.add(userSubmission);
        }

        if(userSubmissions.isEmpty()){
            return userSubmissions;
        }
        return userSubmissionService.addSubmissions(userSubmissions);
    }
}
