package com.microservicios.matricula.service;

import com.microservicios.matricula.model.Matricula;
import com.microservicios.matricula.repository.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    private final MatriculaRepository repository;

    public MatriculaService(MatriculaRepository repository) {
        this.repository = repository;
    }

    public List<Matricula> listar() {
        return repository.findAll();
    }

    public Matricula registrar(Matricula matricula) {
        return repository.save(matricula);
    }
}
