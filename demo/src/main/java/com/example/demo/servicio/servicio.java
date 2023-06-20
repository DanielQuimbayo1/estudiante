package com.example.demo.servicio;

import com.example.demo.estudiante.estudiante;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class servicio {
    public List<estudiante> es = new ArrayList<>();

    public servicio() {

        es.add(new estudiante(01, "daniel", "quimbayo", "11A", 3.3, 3.3, 4.4));
        es.add(new estudiante(02, "daniela", "murcia", "11A", 5, 3.3, 5.0));
        es.add(new estudiante(03, "ana", "manita", "11A", 4.3, 2.3, 4.2));
        es.add(new estudiante(04, "marco", "sevillano", "11A", 2.3, 3.3, 4.4));
        es.add(new estudiante(05, "luis", "peña", "11A", 2.4, 2.3, 4.4));

    }

    public List<estudiante> listabase() {
        return es;
    }


    public estudiante agregarEstudiante(estudiante nuevoEstudiante) {
        nuevoEstudiante.setPromedio(nuevoEstudiante.calcularPromedio());
        nuevoEstudiante.setAprobado(nuevoEstudiante.determinarAprobado());
        es.add(nuevoEstudiante);
        return nuevoEstudiante;

    }
}
