package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;

import Util.Imagens;
import Util.SomenteNumeros;
import Util.TeclasPermitidasCPF;

public class TelaDeCadastro extends TelaPadrao {

    private static final long serialVersionUID = 1L;

    public TelaDeCadastro() {
        setTitle("Tela de Cadastro");
        setResizable(false);
        adicionarImagem("Imagens\\bg tela de cadastro.png");
        botoes();
        textfiled();
        texto();
        setVisible(true);
        repaint();
    }

    private JTextField user;
    private JTextField email;
    private JPasswordField senha;
    private SomenteNumeros cpf;

    public void textfiled() {
        user = new JTextField();
        user.setFont(new Font("Quicksand", Font.BOLD, 12));
        user.setForeground(new Color(74, 44, 131));
        user.setBounds(130, 160, 240, 25);
        add(user);

        email = new JTextField();
        email.setFont(new Font("Quicksand", Font.BOLD, 12));
        email.setForeground(new Color(74, 44, 131));
        email.setBounds(130, 210, 240, 25);
        add(email);
        
        cpf = new SomenteNumeros(11);
        cpf.setDocument(new TeclasPermitidasCPF());
        cpf.setFont(new Font("Quicksand", Font.BOLD, 12));
        cpf.setForeground(new Color(74, 44, 131));
        cpf.setBounds(130, 260, 240, 25);
        add(cpf);

        senha = new JPasswordField();
        senha.setDocument(new TeclasPermitidasCPF());
        senha.setFont(new Font("Quicksand", Font.BOLD, 12));
        senha.setForeground(new Color(74, 44, 131));
        senha.setBounds(130, 310, 240, 25);
        add(senha);
        
    }

    public void texto() {
        JLabel loginJLabel = new JLabel("Login:");
        loginJLabel.setBounds(130, 105, 150, 80);
		loginJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
        loginJLabel.setForeground(new Color(69, 38, 123));
        
        add(loginJLabel);
        
        JLabel emailJLabel = new JLabel("E-mail:");
        emailJLabel.setBounds(130, 155, 150, 80);
        emailJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
		emailJLabel.setForeground(new Color(69, 38, 123));
        add(emailJLabel);

        JLabel cpfJLabel = new JLabel("CPF:");
        cpfJLabel.setBounds(130, 205, 150, 80);
        cpfJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
		cpfJLabel.setForeground(new Color(69, 38, 123));
        add(cpfJLabel);

        JLabel senhaJLabel = new JLabel("Senha:");
        senhaJLabel.setBounds(130, 255, 150, 80);
        senhaJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
		senhaJLabel.setForeground(new Color(69, 38, 123));
        add(senhaJLabel);

        JLabel backJLabel = new JLabel(Imagens.BOTAO_BACK_ICON_TELADECADASTRO);
        backJLabel.setBounds(20, 20, 20, 20);
        backJLabel.addMouseListener(new MouseInputListener(){
        
            @Override
            public void mousePressed(MouseEvent e) {
                dispose();
                new TelaDeLogin();
                
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
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });
        add(backJLabel);

    }

    public void botoes() {
        JButton cadastrarButton = new JButton("CADASTRAR", Imagens.CADASTRAR_TELADECADASTRO_ICON);
        cadastrarButton.setBounds(100, 370, 140, 40);
        cadastrarButton.setFont(new Font("Quicksand", Font.BOLD, 12));
        cadastrarButton.setForeground(new Color(255, 255, 255));
        cadastrarButton.setBackground(new Color(74, 44, 131));
        add(cadastrarButton);

        JButton cancelarButton = new JButton("CANCELAR", Imagens.CANCELAR_TELADECADASTRO_ICON);
        cancelarButton.setBounds(260, 370, 140, 40);
        cancelarButton.setFont(new Font("Quicksand", Font.BOLD, 12));
        cancelarButton.setForeground(new Color(74, 44, 131));
        cancelarButton.setBackground(new Color(255, 255, 255));
        cancelarButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new TelaDeLogin();
				dispose();
				
			}
		});
        add(cancelarButton);
        
    }

    public static void main(String[] args) {
        new TelaDeCadastro();
    }

    



}