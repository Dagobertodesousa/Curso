package Modelo;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Area {
    protected String areaGeral;
    protected Integer codigoArea;
    protected int modulos;
    protected Map<Integer, Set<Disciplina>> identificadorAreaDisciplina = new HashMap<Integer, Set<Disciplina>>();
    protected Docente competenciaDocente;

    public Area(String areaGeral, Integer codigoArea, Set<Disciplina> disciplinas, int modulos) {
        this.areaGeral = areaGeral;
        this.codigoArea = codigoArea;
        this.identificadorAreaDisciplina.put(codigoArea, disciplinas);
        this.modulos = modulos;
    }
    public Area(String areaGeral) {
        this.areaGeral = areaGeral;
    }
    public String getAreaGeral() {
        return areaGeral;
    }
    public int getCodigoArea() {
        return codigoArea;
    }
    public int getModulos() {
        return modulos;
    }
    public Map<Integer, Set<Disciplina>> getIdentificadorAreaDisciplina() {
        return identificadorAreaDisciplina;
    }
    public void setIdentificadorAreaDisciplina(Map<Integer, Set<Disciplina>> identificadorAreaDisciplina) {
        this.identificadorAreaDisciplina = identificadorAreaDisciplina;
    }
    public Docente getCompetenciaDocente() {
        return competenciaDocente;
    }
}