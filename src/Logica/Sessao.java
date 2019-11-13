package Logica;

import java.time.LocalTime;

public class Sessao extends Filme{

    private boolean exibicaoAndNow;
    private String salaDeExibicao;
    private LocalTime horaDeInicio;
    private LocalTime horaDeEncerramento;
    private String filmeExibido;
    private int ingressosVendidos;

    public boolean isExibicaoAndNow() {
        return this.exibicaoAndNow;
    }
    
    public boolean getExibicaoAndNow() {
        return this.exibicaoAndNow;
    }
    
    public void setExibicaoAndNow(boolean exibicaoAndNow) {
        this.exibicaoAndNow = exibicaoAndNow;
    }
    
    public String getSalaDeExibicao() {
        return this.salaDeExibicao;
    }
    
    public void setSalaDeExibicao(String salaDeExibicao) {
        this.salaDeExibicao = salaDeExibicao;
    }
    
    public LocalTime getHoraDeInicio() {
        return this.horaDeInicio;
    }
    
    public void setHoraDeInicio(LocalTime horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }
    
    public LocalTime getHoraDeEncerramento() {
        return this.horaDeEncerramento;
    }
    
    public void setHoraDeEncerramento(LocalTime horaDeEncerramento) {
        this.horaDeEncerramento = horaDeEncerramento;
    }
    
    public String getFilmeExibido() {
        return this.filmeExibido;
    }
    
    public void setFilmeExibido(String filmeExibido) {
        this.filmeExibido = filmeExibido;
    }
    
    public int getIngressosVendidos() {
        return this.ingressosVendidos;
    }
    
    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }


}

    


