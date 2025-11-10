package com.microservicios.matricula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/matriculas")
    public String mostrarMatriculas(Model model) {
        return "matriculas"; // busca el archivo matriculas.html
    }
}
