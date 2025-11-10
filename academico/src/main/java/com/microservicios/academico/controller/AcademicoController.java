package com.microservicios.academico.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/academico")
public class AcademicoController {

    @GetMapping("/cursos")
    public List<Map<String, String>> listarCursos() {
        return List.of(
            Map.of("id", "101", "nombre", "Matemática"),
            Map.of("id", "102", "nombre", "Comunicación")
        );
    }
}