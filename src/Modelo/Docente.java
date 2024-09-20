package Modelo;

public class Docente {
    private int idDocente;
    private String nomeDocente;
    private int contatoDocente;
    private int idArea;
    private String especialidade;

    public Docente(int idDocente, String nomeDocente) {
        this.idDocente = idDocente;
        this.nomeDocente = nomeDocente;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public String getNomeDocente() {
        return nomeDocente;
    }

    public int getContatoDocente() {
        return contatoDocente;
    }

    public void setContatoDocente(int contatoDocente) {
        this.contatoDocente = contatoDocente;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
