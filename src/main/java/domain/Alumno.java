package domain;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;
    private String nombre;
    private String legajo;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }
    public void aprobar(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public boolean cumpleCorrelativas(Materia materia) {
        return materia.correlativasEstanContenidasEn(materiasAprobadas);
    }
}
