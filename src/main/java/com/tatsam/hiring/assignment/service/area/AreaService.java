package com.tatsam.hiring.assignment.service.area;

import com.tatsam.hiring.assignment.models.Area;

import java.util.List;
import java.util.Optional;

public interface AreaService {
    List<Area> getAreas();
    Area createArea(Area area);
    Optional<Area> getArea(Long id);
}
