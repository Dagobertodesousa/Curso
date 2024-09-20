package Modelo;

public class Disciplina {
    protected String nomeDisciplina;
    protected int codigoDisciplina;
    protected int cargaHoraria;

    public Disciplina(String nomeDisciplina, int codigoDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
