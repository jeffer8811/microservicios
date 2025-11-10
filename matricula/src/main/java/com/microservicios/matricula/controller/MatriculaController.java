package com.microservicios.matricula.controller;

import com.microservicios.matricula.model.Matricula;
import com.microservicios.matricula.repository.MatriculaRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final MatriculaRepository repository;

    public MatriculaController(MatriculaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Matricula> listarMatriculas() {
        return repository.findAll();
    }

    @PostMapping
    public Map<String, Object> registrarMatricula(@RequestBody Matricula matricula) {
        try {
            // Consultamos el microservicio usuario para verificar si existe
String url = "http://usuario:8080/api/usuarios/" + matricula.getUsuarioId();
            Map usuario = restTemplate.getForObject(url, Map.class);
            Matricula guardada = repository.save(matricula);

            return Map.of(
                    "estado", "ok",
                    "mensaje", "Matrícula registrada correctamente",
                    "matricula", guardada,
                    "usuario", usuario);
        } catch (Exception e) {
            return Map.of(
                    "estado", "error",
                    "mensaje", "No se pudo registrar la matrícula (usuario no encontrado)",
                    "detalle", e.getMessage());
        }
    }
}
