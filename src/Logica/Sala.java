package Logica;

import java.time.LocalTime;

public class Sala extends Sessao {

    public Sala(boolean exibicaoAndNow, String salaDeExibicao, LocalTime horaDeInicio, LocalTime horaDeEncerramento,
            String filmeExibido, int ingressosDisponiveis) {
        super(exibicaoAndNow, salaDeExibicao, horaDeInicio, horaDeEncerramento, filmeExibido, ingressosDisponiveis);
        // TODO Auto-generated constructor stub
    }

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
    


}