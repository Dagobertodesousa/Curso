package Modelo;

import java.util.Map;

public abstract class Area {
    private String areaGeral;
    private int codigoArea;
    private Map<Integer, Disciplina> identificadorAreaDisciplina;
    private Docente competenciaDocente;

    public Area(String areaGeral) {
        this.areaGeral = areaGeral;
    }
    public String getAreaGeral() {
        return areaGeral;
    }
    public int getCodigoArea() {
        return codigoArea;
    }
    public Map<Integer, Disciplina> getIdentificadorAreaDisciplina() {
        return identificadorAreaDisciplina;
    }
    public Docente getCompetenciaDocente() {
        return competenciaDocente;
    }
}
