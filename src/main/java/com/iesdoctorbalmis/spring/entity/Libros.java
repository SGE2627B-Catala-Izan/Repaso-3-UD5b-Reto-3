package com.iesdoctorbalmis.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "libros")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String curso;
    
    @Column(nullable = false, length = 30)
    private String area;
    
    @Column(length = 15)
    private String isbn;

    @Column(nullable = false, length = 60)
    private String titulo;
    
    @Column(length = 30)
    private String observaciones;

    @Column(length = 20)
    private String imagen;

    @Column(length = 20)
    private Integer cantidad;
}