package Modelo;

import java.util.Map;
import java.util.Set;

public class Turma {
    private Integer idTurma;
    private Integer idDocente;
    private String nomeTurma;
    private Map<Integer, Set<Discente>> idDiscentes;
    private String sala;
    private Map<Area, Set<Disciplina>> areaDisciplina;

    public Turma(Integer idTurma, Integer idDocente, String nomeTurma, Map<Integer, Set<Discente>> idDiscentes,
            String sala, Map<Area, Set<Disciplina>> areaDisciplina) {
        this.idTurma = idTurma;
        this.idDocente = idDocente;
        this.nomeTurma = nomeTurma;
        this.idDiscentes = idDiscentes;
        this.sala = sala;
        this.areaDisciplina = areaDisciplina;
    }

    public Integer getIdTurma() {
        return idTurma;
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public Map<Integer, Set<Discente>> getIdDiscentes() {
        return idDiscentes;
    }

    public String getSala() {
        return sala;
    }

    public Map<Area, Set<Disciplina>> getAreaDisciplina() {
        return areaDisciplina;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public void setIdDiscentes(Map<Integer, Set<Discente>> idDiscentes) {
        this.idDiscentes = idDiscentes;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setAreaDisciplina(Map<Area, Set<Disciplina>> areaDisciplina) {
        this.areaDisciplina = areaDisciplina;
    }    
}
