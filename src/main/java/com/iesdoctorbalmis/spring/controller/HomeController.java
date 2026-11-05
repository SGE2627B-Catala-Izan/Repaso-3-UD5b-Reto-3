package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.iesdoctorbalmis.spring.repository.AlumnosRepository;
import com.iesdoctorbalmis.spring.repository.CursosRepository;
import com.iesdoctorbalmis.spring.repository.LibrosRepository;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController {

    private final AlumnosRepository alumnosRepository;
    private final CursosRepository cursosRepository;
    private final LibrosRepository librosRepository;

    // Inyección por constructor
    public HomeController(AlumnosRepository alumnosRepository, 
                          CursosRepository cursosRepository, 
                          LibrosRepository librosRepository) {
        this.alumnosRepository = alumnosRepository;
        this.cursosRepository = cursosRepository;
        this.librosRepository = librosRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("totalAlumnos", alumnosRepository.count());
        model.addAttribute("totalCursos", cursosRepository.count());    
        model.addAttribute("totalLibros", librosRepository.count());
        return "index";
    }
    
}