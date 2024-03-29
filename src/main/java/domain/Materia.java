package domain;
import java.util.ArrayList;
import java.util.List;
public class Materia {
    private String nombre;
    private List<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new ArrayList<>();
    }

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void addMateriaCorrelativa(Materia materia) {
        materiasCorrelativas.add(materia);
    }

    public boolean correlativasEstanContenidasEn(List<Materia> materias) {
        return materias.containsAll(this.materiasCorrelativas);
    }
}
