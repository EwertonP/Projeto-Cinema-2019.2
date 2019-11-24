package Logica;

public class Usuario {

    private String cpf;
    private String login;
    private String senha;
    private String email;
    

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(String cpf, String login, String senha, String email) {
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public Usuario() {

    }

}