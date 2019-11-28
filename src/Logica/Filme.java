package Logica;

import java.time.LocalTime;

public class Filme {

    private String duracaoDoFilme;
    private String nome;
    private String genero;
    private int classificacao;
    private String sinopse;

    public String getDuracaoDoFilme() {
        return this.duracaoDoFilme;
    }

    public void setDuracaoDoFilme(String duracaoDoFilme) {
        this.duracaoDoFilme = duracaoDoFilme;
    }

    public String getSinopse() {
        return this.sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        return this.classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    
    public Filme(String duracaoDoFilme, String nome, String genero, int classificacao, String sinopse) {
        this.duracaoDoFilme = duracaoDoFilme;
        this.nome = nome;
        this.genero = genero;
        this.classificacao = classificacao;
        this.sinopse = sinopse;
    }



        

}