package com.iesdoctorbalmis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iesdoctorbalmis.spring.entity.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long> {
    
}