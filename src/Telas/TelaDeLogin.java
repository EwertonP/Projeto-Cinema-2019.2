package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import Util.Imagens;

public class TelaDeLogin extends TelaPadrao {

	private static final long serialVersionUID = 1L;

	public TelaDeLogin() {
		setTitle("Tela de Login");
		setResizable(false);
		background();
		getContentPane().add(new PainelComImage("bg.png"));
		repaint();
		adicionarJLabel();
		botoes();
		adicionarCaixaTexto();
		setLayout(null);
		setVisible(true);
	}

	private JTextField tfLogin;
	private JPasswordField tfsenha;

	public void background() {
		JLabel bg = new JLabel(Imagens.BACKGROUND_ICON);
		bg.setBounds(0, 0, 500, 500);
		add(bg);
	}

	public void adicionarJLabel() {
		
		JLabel login = new JLabel("Login");
		login.setBounds(100, 165, 150, 80);
		login.setFont(new Font("Quicksand", Font.BOLD, 14));
		login.setBackground(new Color(255, 255, 255));
		add(login);

		JLabel senha = new JLabel("Senha");
		senha.setBounds(100, 238, 150, 80);
		senha.setFont(new Font("Quicksand", Font.BOLD, 14));
		senha.setForeground(new Color(255,255,255));
		add(senha);

		JLabel esqueceuSuaSenha = new JLabel("Esqueceu sua senha?");
		esqueceuSuaSenha.setForeground(new Color(74, 44, 131));
		esqueceuSuaSenha.setBounds(180, 380, 150, 80);
		esqueceuSuaSenha.setFont(new Font("Quicksand", Font.BOLD, 12));
		add(esqueceuSuaSenha);
	}

	private void adicionarCaixaTexto() {
		tfLogin = new JTextField();
		tfLogin.setBounds(155, 195, 200, 25);
		tfLogin.setToolTipText("Digite seu login aqui!");
		add(tfLogin);

		tfsenha = new JPasswordField();
		tfsenha.setBounds(155, 265, 200, 25);
		tfsenha.setToolTipText("Digite sua senha aqui!");
		add(tfsenha);
		
	}

	public void botoes() {
		JButton loginButton = new JButton("ENTRAR", Imagens.ENTRAR_ICON);
		loginButton.setForeground(new Color(255, 255, 255));
		loginButton.setBounds(100, 350, 140, 40);
		loginButton.setFont(new Font("Quicksand", Font.BOLD, 12));
		loginButton.setBackground(new Color(105, 61, 182));
		
		JButton cadasButton = new JButton("CADASTRAR", Imagens.CADASTR_ICON);
		cadasButton.setBounds(260, 350, 140, 40);
		cadasButton.setFont(new Font("Quicksand", Font.BOLD, 12));
		cadasButton.setForeground(new Color(74, 44, 131));
		cadasButton.setBackground(new Color(255, 255, 255));
		cadasButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new TelaDeCadastro();
				dispose();
				
			}
		});
		add(loginButton);
		add(cadasButton);
	}
	
	public static void main(String[] args) {
		new TelaDeLogin();
	}

}