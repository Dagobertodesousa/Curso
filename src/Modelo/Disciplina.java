package Modelo;

public abstract class Disciplina {
    private String nome;
    private String descricao;
    private int codigoDisciplina;
    private int codigoDocente;
    private int cargaHoraria;

    public Disciplina(String nome, String descricao, int codigoDisciplina, int codigoDocente, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigoDisciplina = codigoDisciplina;
        this.codigoDocente = codigoDocente;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public int getCodigoDocente() {
        return codigoDocente;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
