package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.iesdoctorbalmis.spring.repository.CursosRepository;

@Controller
@RequestMapping("/cursos")
public class CursosController {
    
    private final CursosRepository cursosRepository;

    // Inyección por constructor
    public CursosController(CursosRepository cursosRepository) {
        this.cursosRepository = cursosRepository;
    }

    @GetMapping
    public String lista(Model model) {
        model.addAttribute("cursos", cursosRepository.findAll());
        return "cursos/lista";  // → templates/cursos/lista.html
    }
    
}