package com.microservicios.reporte.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@RestController
@RequestMapping("/api/reporte")
public class ReporteController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/ver")
    public Map<String, Object> generarReporte() {
        Object matriculaData = restTemplate.getForObject("http://matricula:8080/api/matriculas/todo", Object.class);
        return Map.of(
            "mensaje", "Reporte generado correctamente a partir de matrícula",
            "data", matriculaData
        );
    }
}
