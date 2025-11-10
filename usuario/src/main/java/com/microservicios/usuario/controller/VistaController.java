package com.microservicios.usuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistaController {

    @GetMapping("/registro")
    public String registro() {
        return "registro"; // Spring Boot buscará registro.html en resources/templates
    }
}