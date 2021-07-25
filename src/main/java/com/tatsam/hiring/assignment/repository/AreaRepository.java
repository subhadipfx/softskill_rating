package com.tatsam.hiring.assignment.repository;

import com.tatsam.hiring.assignment.models.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
}
