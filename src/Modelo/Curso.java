package Modelo;

public class Curso {
    private String nomeCurso;
    private int codigoCurso;
    private int cargaHorariaTotal;
    private int modulos;

    public Curso(String nomeCurso, int codigoCurso, int cargaHorariaTotal, int modulos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.cargaHorariaTotal = cargaHorariaTotal;
        this.modulos = modulos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public int getModulos() {
        return modulos;
    }
    
}
