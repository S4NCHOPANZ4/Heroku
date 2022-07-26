package io.spring.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.spring.pma.entity.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{
    
    @Override
    public List<Project> findAll();
}
