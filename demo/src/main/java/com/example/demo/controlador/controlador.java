package com.example.demo.controlador;
import com.example.demo.estudiante.estudiante;
import com.example.demo.servicio.servicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controlador {
    private servicio servicio;

    public controlador(servicio servicio) {
        this.servicio = servicio;
    }
    @GetMapping("/listabase")
    public List<estudiante> listabase() {
        List<estudiante> estudiantes = servicio.listabase();
        for (estudiante a2 : estudiantes) {
            a2.setPromedio(a2.calcularPromedio());
            a2.setAprobado(a2.determinarAprobado());
        }
        return estudiantes;
    }
    @PostMapping("/agregarEstudiante")
    public estudiante agregarEstudiante(@RequestBody estudiante nuevoEstudiante) {
        return servicio.agregarEstudiante(nuevoEstudiante);
    }
    }

