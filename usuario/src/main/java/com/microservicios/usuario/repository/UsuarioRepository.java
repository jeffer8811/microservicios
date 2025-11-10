package com.microservicios.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservicios.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}