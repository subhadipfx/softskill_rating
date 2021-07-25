package com.tatsam.hiring.assignment.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSubmissionDTO {
    private long user_id;
    private long area_id;
    private int priority;
    private int satisfaction;
}
