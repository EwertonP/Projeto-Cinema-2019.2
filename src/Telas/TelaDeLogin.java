package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;

import Logica.BancoDeDados;
import Logica.Persistencia;
import Logica.Usuario;

import javax.swing.JPasswordField;

import Util.Imagens;

public class TelaDeLogin extends TelaPadrao {

	private static final long serialVersionUID = 1L;

	public TelaDeLogin() {
		setTitle("Login");
		setResizable(false);
		adicionarImagem("Imagens\\bg tela de login .png");
		adicionarJLabel();
		botoes();
		adicionarCaixaTexto();
		setVisible(true);
		repaint();
	}

	Persistencia p = new Persistencia();
	BancoDeDados b = p.recuperarCentral();

	private JTextField tfLogin;
	private JPasswordField tfsenha;

	public void adicionarJLabel() {

		final JLabel login = new JLabel("Login");
		login.setBounds(130, 125, 150, 80);
		login.setFont(new Font("Quicksand", Font.BOLD, 14));
		login.setForeground(new Color(255, 255, 255));
		add(login);

		final JLabel senha = new JLabel("Senha");
		senha.setBounds(130, 195, 150, 80);
		senha.setFont(new Font("Quicksand", Font.BOLD, 14));
		senha.setForeground(new Color(255, 255, 255));
		add(senha);

		final JLabel esqueceuSuaSenha = new JLabel("Esqueceu sua senha?");
		esqueceuSuaSenha.setForeground(new Color(255, 255, 255));
		esqueceuSuaSenha.setBounds(160, 380, 170, 80);
		esqueceuSuaSenha.setFont(new Font("Quicksand", Font.BOLD, 14));
		add(esqueceuSuaSenha);
	}

	public void adicionarCaixaTexto() {
		tfLogin = new JTextField();
		tfLogin.setFont(new Font("Quicksand", Font.BOLD, 12));
		tfLogin.setForeground(new Color(74, 44, 131));
		tfLogin.setBounds(130, 180, 240, 25);
		tfLogin.setToolTipText("Digite seu login aqui!");
		add(tfLogin);

		tfsenha = new JPasswordField();
		tfsenha.setFont(new Font("Quicksand", Font.BOLD, 12));
		tfsenha.setForeground(new Color(74, 44, 131));
		tfsenha.setBounds(130, 250, 240, 25);
		tfsenha.setToolTipText("Digite sua senha aqui!");
		add(tfsenha);
	}

	public void botoes() {
		final JButton loginButton = new JButton("ENTRAR", Imagens.ENTRAR_ICON);
		loginButton.setForeground(new Color(255, 255, 255));
		loginButton.setBounds(100, 350, 140, 40);
		loginButton.setFont(new Font("Quicksand", Font.BOLD, 12));
		loginButton.setBackground(new Color(105, 61, 182));
		loginButton.addMouseListener(new MouseInputListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				String login = tfLogin.getText();
				String senha = new String(tfsenha.getPassword());
				for (Usuario u : b.getAdministradoresCadastrados()) {
					if (u.getLogin().equals(login) && u.getSenha().equals(senha)
							|| ((login.equals("admin")) && (senha.equals("admin")))) {
						JOptionPane.showMessageDialog(null, "Bem-Vindo", "goocine", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						new TelaHome();
					}
					else{
						JOptionPane.showMessageDialog(null, "Usuário não encontrado", "goocine", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				if (login.isEmpty() || senha.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Não deixe nada em branco", "goocine",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});

		final JButton cadasButton = new JButton("CADASTRAR", Imagens.CADASTRAR_TELADELOGIN_ICON);
		cadasButton.setBounds(260, 350, 140, 40);
		cadasButton.setFont(new Font("Quicksand", Font.BOLD, 12));
		cadasButton.setForeground(new Color(74, 44, 131));
		cadasButton.setBackground(new Color(255, 255, 255));
		cadasButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				new TelaDeCadastro();
				dispose();

			}
		});
		add(loginButton);
		add(cadasButton);
	}

	public static void main(final String[] args) {
		new TelaDeLogin();
	}

}