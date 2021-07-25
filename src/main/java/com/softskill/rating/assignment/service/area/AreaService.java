package com.softskill.rating.assignment.service.area;

import com.softskill.rating.assignment.models.Area;

import java.util.List;
import java.util.Optional;

public interface AreaService {
    List<Area> getAreas();
    Area createArea(Area area);
    Optional<Area> getArea(Long id);
}
