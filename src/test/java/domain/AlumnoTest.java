package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class AlumnoTest {

    @Test
    public void alumnoQuePuedeCursarAnalisis2(){
        Materia analisis1 = new Materia("Analisis uno");
        Materia analisis2 = new Materia("Analisis uno");
        Alumno unAlumno = new Alumno("Jose", "124578");
        unAlumno.aprobar(analisis1);
        analisis2.addMateriaCorrelativa(analisis1);
        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.addMateria(analisis2);

        Assert.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void alumnoQueNoPuedeCursarAnalisis2(){
        Materia analisis1 = new Materia("Analisis uno");
        Materia analisis2 = new Materia("Analisis uno");
        Alumno unAlumno = new Alumno("Jose", "124578");

        analisis2.addMateriaCorrelativa(analisis1);
        Inscripcion unaInscripcion = new Inscripcion(unAlumno);
        unaInscripcion.addMateria(analisis2);
        Assert.assertFalse(unaInscripcion.aprobada());
    }

}
