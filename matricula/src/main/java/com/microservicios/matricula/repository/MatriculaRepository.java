package com.microservicios.matricula.repository;

import com.microservicios.matricula.model.Matricula;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class MatriculaRepository {
    private final List<Matricula> matriculas = new ArrayList<>();
    private Long nextId = 1L;

    public List<Matricula> findAll() {
        return matriculas;
    }

    public Matricula save(Matricula matricula) {
        matricula.setId(nextId++);
        matriculas.add(matricula);
        return matricula;
    }
}
