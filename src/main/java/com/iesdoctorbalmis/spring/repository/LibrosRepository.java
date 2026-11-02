package com.iesdoctorbalmis.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iesdoctorbalmis.spring.entity.Libros;

public interface LibrosRepository extends JpaRepository<Libros, Long> {
    
}