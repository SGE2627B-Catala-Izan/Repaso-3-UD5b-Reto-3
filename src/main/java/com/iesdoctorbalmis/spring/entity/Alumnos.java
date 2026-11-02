package com.iesdoctorbalmis.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alumnos")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Alumnos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 40)
    private String nombre;

    @Column(nullable = false, length = 30)
    private String apellido1;

    @Column(nullable = false, length = 30)
    private String apellido2;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_alumno", nullable = false)
    private TipoAlumno tipoAlumno;
    
    @Column(nullable = false, length = 20)
    private String curso;
}