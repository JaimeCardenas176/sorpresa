package ejercicio1;

public class PilotoF1Impl implements PilotoF1 {
    private String nombre;
    private String escuderia;
    private String pais;
    
    public PilotoF1Impl(String nombre, String escuderia, String pais) {
        this.nombre=nombre;
        this.escuderia=escuderia;
        this.pais=pais;
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getEscuderia() {
        return this.escuderia;
    }

    @Override
    public String getPais() {
        return this.pais;
    }
    
}
