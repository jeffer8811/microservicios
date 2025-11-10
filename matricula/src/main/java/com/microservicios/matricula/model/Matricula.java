package com.microservicios.matricula.model;

public class Matricula {
    private Long id;
    private Long usuarioId;  // id del usuario (estudiante)
    private String curso;
    private String fecha;

    public Matricula() {}

    public Matricula(Long id, Long usuarioId, String curso, String fecha) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.curso = curso;
        this.fecha = fecha;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}
