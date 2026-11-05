package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.iesdoctorbalmis.spring.repository.LibrosRepository;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
@RequestMapping ("/libros")
public class LibrosController {
    
    private final LibrosRepository librosRepository;

    // Inyección por constructor
    public LibrosController(LibrosRepository librosRepository) {
        this.librosRepository = librosRepository;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("libros", librosRepository.findAll());
        return "libros/lista";  // → templates/libros/lista.html
    }
    
}   