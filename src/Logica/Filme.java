package Logica;

import java.time.LocalTime;

public class Filme {

    private LocalTime duracaoDoFilme;
    private String nome;
    private String genero;
    private int classificacao;

    public LocalTime getDuracaoDoFilme() {
        return this.duracaoDoFilme;
    }

    public void setDuracaoDoFilme(LocalTime duracaoDoFilme) {
        this.duracaoDoFilme = duracaoDoFilme;
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

        

}