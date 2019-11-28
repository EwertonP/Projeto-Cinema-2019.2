package Logica;

import java.time.LocalTime;

public class Sessao extends Filme {

    public Sessao(String duracaoDoFilme, String nome, String genero, int classificacao, String sinopse) {
        super(duracaoDoFilme, nome, genero, classificacao, sinopse);
        // TODO Auto-generated constructor stub
    }

	private boolean exibicaoAndNow;
    private String salaDeExibicao;
    private LocalTime horaDeInicio;
    private LocalTime horaDeEncerramento;
    private String filmeExibido;
    private int ingressosDisponiveis;

    public boolean isExibicaoAndNow() {
        return this.exibicaoAndNow;
    }

    public boolean getExibicaoAndNow() {
        return this.exibicaoAndNow;
    }

    public void setExibicaoAndNow(final boolean exibicaoAndNow) {
        this.exibicaoAndNow = exibicaoAndNow;
    }

    public String getSalaDeExibicao() {
        return this.salaDeExibicao;
    }

    public void setSalaDeExibicao(final String salaDeExibicao) {
        this.salaDeExibicao = salaDeExibicao;
    }

    public LocalTime getHoraDeInicio() {
        return this.horaDeInicio;
    }

    public void setHoraDeInicio(final LocalTime horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public LocalTime getHoraDeEncerramento() {
        return this.horaDeEncerramento;
    }

    public void setHoraDeEncerramento(final LocalTime horaDeEncerramento) {
        this.horaDeEncerramento = horaDeEncerramento;
    }

    public String getFilmeExibido() {
        return this.filmeExibido;
    }

    public void setFilmeExibido(final String filmeExibido) {
        this.filmeExibido = filmeExibido;
    }

    public int getIngressosDisponiveis() {
        return this.ingressosDisponiveis;
    }

    public void setIngressosDisponiveis(final int ingressosDisponiveis) {
        this.ingressosDisponiveis = ingressosDisponiveis;
    }


}
