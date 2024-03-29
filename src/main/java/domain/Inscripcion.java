package domain;

import java.util.ArrayList;
import java.util.List;
public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public boolean aprobada() {
        return materias.stream().allMatch(materia -> alumno.cumpleCorrelativas(materia));
    }

    public void addMateria(Materia materia) {
        materias.add(materia);
    }

}
