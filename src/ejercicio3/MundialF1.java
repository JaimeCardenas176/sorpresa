package ejercicio3;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import ejercicio1.PilotoF1;
import ejercicio1.PilotoF1Puntuado;
import ejercicio2.CarreraF1;

public interface MundialF1 {
    // Propiedades
    Integer getAño();

    SortedSet<CarreraF1> getCalendario();

    Set<PilotoF1Puntuado> getPilotos();

    // Operaciones
    List<CarreraF1> posterioresA(CarreraF1 c);

    void puntuarCarrera(CarreraF1 c);

    Integer carrerasGanadas(PilotoF1 p);

    String masCarrerasGanadas();

    PilotoF1 ganaEnCasa();

    Boolean existeGanador(String pais, Integer n);
}
