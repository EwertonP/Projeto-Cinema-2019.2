package Logica;

public class Sala extends Sessao {

    private String nome;
    private int totalDeAssentos;
    private float precoDoIngresso;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeAssentos() {
        return this.totalDeAssentos;
    }

    public void setTotalDeAssentos(int totalDeAssentos) {
        this.totalDeAssentos = totalDeAssentos;
    }

    public float getPrecoDoIngresso() {
        return this.precoDoIngresso;
    }

    public void setPrecoDoIngresso(float precoDoIngresso) {
        this.precoDoIngresso = precoDoIngresso;
    }
    

    public Sala(String nome, int totalDeAssentos, float precoDoIngresso) {
        this.nome = nome;
        this.totalDeAssentos = totalDeAssentos;
        this.precoDoIngresso = precoDoIngresso;
    }


    public Sala() {
    }


}