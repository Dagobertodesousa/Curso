package Modelo;

import java.util.Set;

public abstract class Docente {
    private String docente;
    private String endereco;
    private int telefone;
    private String area;
    private Set<Disciplina> disciplinas;
    
    public Docente(String docente) {
        this.docente = docente;
    }

    public String getDocente() {
        return docente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
