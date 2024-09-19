package Modelo;

import java.util.Map;
import java.util.Set;

public abstract class Turma {
    private String nomeTurma;
    private Set<Discente> discentes;
    private int quantidadeModulos;
    private String sala;
    private Map<Area, Disciplina> disciplinaArea;

    public Turma(String nomeTurma, Set<Discente> discentes, int quantidadeModulos, String sala,
            Map<Area, Disciplina> disciplinaArea) {
        this.nomeTurma = nomeTurma;
        this.discentes = discentes;
        this.quantidadeModulos = quantidadeModulos;
        this.sala = sala;
        this.disciplinaArea = disciplinaArea;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public Set<Discente> getDiscentes() {
        return discentes;
    }

    public int getQuantidadeModulos() {
        return quantidadeModulos;
    }

    public Map<Area, Disciplina> getDisciplinaArea() {
        return disciplinaArea;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
