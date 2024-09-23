package Modelo;

public class Discente {
    private String nomeDiscente;
    private int idDiscente;
    private int idCurso;
    private int contato;
    private int cargaHorariaConcluida;
    
    public Discente(String nomeDiscente, int idDiscente) {
        this.nomeDiscente = nomeDiscente;
        this.idDiscente = idDiscente;
        this.idCurso = 0;
        this.cargaHorariaConcluida = 0;
    }

    public Discente(String nomeDiscente, int idDiscente, int contato) {
        this.nomeDiscente = nomeDiscente;
        this.idDiscente = idDiscente;
        this.idCurso = 0;
        this.contato = contato;
        this.cargaHorariaConcluida = 0;
    }

    public Discente(String nomeDiscente, int idDiscente, int contato, int cargaHorariaConcluida) {
        this.nomeDiscente = nomeDiscente;
        this.idDiscente = idDiscente;
        this.idCurso = 0;
        this.contato = contato;
        this.cargaHorariaConcluida = cargaHorariaConcluida;
    }

    public String getNomeDiscente() {
        return nomeDiscente;
    }

    public int getIdDiscente() {
        return idDiscente;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public int getCargaHorariaConcluida() {
        return cargaHorariaConcluida;
    }

    public void setCargaHorariaConcluida(int cargaHorariaConcluida) {
        this.cargaHorariaConcluida = cargaHorariaConcluida;
    }

    public boolean conclusaoCurso(Curso curso){
        if (this.getCargaHorariaConcluida() >= curso.getCargaHorariaTotal()){
            return true;
        }
        return false;
    }

    public void emissaoCertificado(){
        if (condition) {
            
        }
    }
}
