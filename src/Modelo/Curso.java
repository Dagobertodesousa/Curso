package Modelo;

public abstract class Curso {
    private String nomeCurso;
    private int codigoCurso;
    private int cargaHorariaTotal;
    private int modulos;
    
    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
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
