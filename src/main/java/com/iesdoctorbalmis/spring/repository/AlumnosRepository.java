package com.iesdoctorbalmis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iesdoctorbalmis.spring.entity.Alumnos;

public interface AlumnosRepository extends JpaRepository<Alumnos, Long> {
    
}