package Telas;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Util.Imagens;

public class TelaDeCadastro extends TelaPadrao{

    private static final long serialVersionUID = 1L;


    public TelaDeCadastro() {
        setTitle("Tela de Cadastro");
        setResizable(false);
        Label();
        setVisible(true);
        repaint();
    }

    private JTextField user;
    private JTextField email;
    private JPasswordField senha;
    private JTextField cpf;

    public void caixaDeTexto() {
        
        
    }

    public void Label() {
        
    }


    public static void main(String[] args) {
        new TelaDeCadastro();
    }

    



}