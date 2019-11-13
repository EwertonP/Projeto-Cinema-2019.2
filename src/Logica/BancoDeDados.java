package Logica;

import java.util.ArrayList;

public class BancoDeDados {

    private ArrayList<Usuario> AdministradoresCadastrados = new ArrayList<Usuario>();
    private ArrayList<Sala> SalasCadastradas = new ArrayList<Sala>();
    private ArrayList<Sessao> SessoesCadastradas = new ArrayList<Sessao>();
    private ArrayList<Filme> FilmesCadastrados = new ArrayList<Filme>();
    private static BancoDeDados bd = null;

    public boolean cadastarAdmin(Usuario u) {
        for (Usuario usuario : AdministradoresCadastrados) {
            if (usuario.getCpf().equals(u.getCpf())) {
                return false;
            }
        }
        AdministradoresCadastrados.add(u);
        return true;
    }

    public String recuperarSenha(String cpf) {
        for (Usuario usuario : AdministradoresCadastrados) {
            if (usuario.getCpf().equals(cpf)) {
                return usuario.getSenha();
            }
        }
        return null;
    }

    public boolean redefinirSenha(String cpf, String novaSenha) {
        for (Usuario usuario : AdministradoresCadastrados) {
            if (usuario.getCpf().equals(cpf)) {
                usuario.setSenha(novaSenha);
                return true;
            }
        }
        return false;
    }

    public boolean cadastrarFilme(Filme filme) {
        for (Filme f : FilmesCadastrados) {
            if (f.getNome().equals(filme.getNome())) {
                return false;
            }
        }
        FilmesCadastrados.add(filme);
        return true;
    }

    public boolean excluirFilme(String nome) {
        for (Filme f : FilmesCadastrados) {
            if (f.getNome().equals(nome)) {
                FilmesCadastrados.remove(f);
                return true;
            }
        }
        return false;
    }

    public boolean adicionarSala(Sala s) {
        for (Sala sl : SalasCadastradas) {
            if (sl.getNome().equals(s.getNome())) {
                return false;
            }
        }
        SalasCadastradas.add(s);
        return true;
    }

    public ArrayList<Usuario> getAdministradoresCadastrados() {
        return this.AdministradoresCadastrados;
    }

    public void setAdministradoresCadastrados(ArrayList<Usuario> AdministradoresCadastrados) {
        this.AdministradoresCadastrados = AdministradoresCadastrados;
    }

    public ArrayList<Sala> getSalasCadastradas() {
        return this.SalasCadastradas;
    }

    public void setSalasCadastradas(ArrayList<Sala> SalasCadastradas) {
        this.SalasCadastradas = SalasCadastradas;
    }

    public ArrayList<Sessao> getSessoesCadastradas() {
        return this.SessoesCadastradas;
    }

    public void setSessoesCadastradas(ArrayList<Sessao> SessoesCadastradas) {
        this.SessoesCadastradas = SessoesCadastradas;
    }

    public ArrayList<Filme> getFilmesCadastrados() {
        return this.FilmesCadastrados;
    }

    public void setFilmesCadastrados(ArrayList<Filme> FilmesCadastrados) {
        this.FilmesCadastrados = FilmesCadastrados;
    }

    public static BancoDeDados obterAInstancia() {
        if (bd == null)
            bd = new BancoDeDados();
        return bd;
    }

}