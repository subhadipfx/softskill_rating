package com.tatsam.hiring.assignment.service.area;

import com.tatsam.hiring.assignment.models.Area;
import com.tatsam.hiring.assignment.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<Area> getAreas() {
        return areaRepository.findAll();
    }

    @Override
    public Area createArea(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public Optional<Area> getArea(Long id) {
        return areaRepository.findById(id);
    }
}
