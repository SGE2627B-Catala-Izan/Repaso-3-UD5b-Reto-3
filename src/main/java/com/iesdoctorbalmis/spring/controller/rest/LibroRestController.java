package com.iesdoctorbalmis.spring.controller.rest;

import java.util.List;
import com.iesdoctorbalmis.spring.entity.Libros;
import com.iesdoctorbalmis.spring.repository.LibrosRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/libros")
public class LibroRestController {
    private final LibrosRepository librosRepository;

    public LibroRestController(LibrosRepository librosRepository) {
        this.librosRepository = librosRepository;
    }

    @GetMapping
    public List<Libros> listar() {
        return librosRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libros> buscarPorId(@PathVariable Long id) {
        return librosRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
