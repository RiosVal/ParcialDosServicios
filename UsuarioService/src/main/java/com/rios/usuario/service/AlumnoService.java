package com.rios.usuario.service;

import com.rios.usuario.entity.Alumno;

import java.util.Optional;

public interface AlumnoService {
    public Iterable<Alumno> findAll();
    public Optional<Alumno> findById(Long id);
    public Object save(Alumno alumno);
    public void deleteById(Long id);
}
