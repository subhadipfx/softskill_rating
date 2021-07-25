package com.tatsam.hiring.assignment.controller;

import com.tatsam.hiring.assignment.models.Area;
import com.tatsam.hiring.assignment.service.area.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Area> getAreas(){
        return  areaService.getAreas();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Area createArea(@RequestBody Area area){
        return areaService.createArea(area);
    }
}
