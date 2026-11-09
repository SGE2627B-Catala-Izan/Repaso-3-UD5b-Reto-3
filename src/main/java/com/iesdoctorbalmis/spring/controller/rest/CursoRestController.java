package com.iesdoctorbalmis.spring.controller.rest;

import com.iesdoctorbalmis.spring.entity.Cursos;
import com.iesdoctorbalmis.spring.repository.CursosRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoRestController {

    private final CursosRepository cursosRepository;

    public CursoRestController(CursosRepository cursosRepository) {
        this.cursosRepository = cursosRepository;
    }

    
    @GetMapping
    public List<Cursos> listar() {
        return cursosRepository.findAll();
    }

}
