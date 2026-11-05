package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.iesdoctorbalmis.spring.repository.AlumnosRepository;

@Controller 
@RequestMapping ("/alumnos")
public class AlumnosController {
    
    private final AlumnosRepository alumnosRepository;

    // Inyección por constructor
    public AlumnosController(AlumnosRepository alumnosRepository) {
        this.alumnosRepository = alumnosRepository;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("alumnos", alumnosRepository.findAll());
        return "alumnos/lista";  // → templates/alumnos/lista.html
    }
    
}