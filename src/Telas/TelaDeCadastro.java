package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;
import javax.swing.text.MaskFormatter;

import Logica.BancoDeDados;
import Logica.Persistencia;
import Logica.Usuario;
import Util.Imagens;

public class TelaDeCadastro extends TelaPadrao {

    private static final long serialVersionUID = 1L;

    public TelaDeCadastro() {
        setTitle("Cadastro de Usuário");
        setResizable(false);
        adicionarImagem("Imagens\\bg tela de cadastro.png");
        botoes();
        textfiled();
        texto();
        setVisible(true);
        repaint();
    }

    private JTextField tfuser;
    private JTextField tfemail;
    private JPasswordField tfsenha;
    private JFormattedTextField tfcpf;

    Persistencia p = new Persistencia();
    BancoDeDados b = p.recuperarCentral();

    public void textfiled() {
        tfuser = new JTextField();
        tfuser.setFont(new Font("Quicksand", Font.BOLD, 12));
        tfuser.setForeground(new Color(74, 44, 131));
        tfuser.setBounds(130, 160, 240, 25);
        add(tfuser);

        tfemail = new JTextField();
        tfemail.setFont(new Font("Quicksand", Font.BOLD, 12));
        tfemail.setForeground(new Color(74, 44, 131));
        tfemail.setBounds(130, 210, 240, 25);
        add(tfemail);

        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            tfcpf = new JFormattedTextField(mascaraCPF);
            tfcpf.setFont(new Font("Quicksand", Font.BOLD, 12));
            tfcpf.setForeground(new Color(74, 44, 131));
            tfcpf.setBounds(130, 260, 240, 25);
            add(tfcpf);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        tfsenha = new JPasswordField();
        tfsenha.setFont(new Font("Quicksand", Font.BOLD, 12));
        tfsenha.setForeground(new Color(74, 44, 131));
        tfsenha.setBounds(130, 310, 240, 25);
        add(tfsenha);

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
        backJLabel.addMouseListener(new MouseInputListener() {

            @Override
            public void mousePressed(MouseEvent e) {

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
                dispose();
                new TelaDeLogin();

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
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String senha = new String(tfsenha.getPassword());

                if (tfuser.getText().isEmpty() || tfemail.getText().isEmpty() || tfsenha.getText().isEmpty()
                        || tfcpf.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não deixe nada em branco!", "Aviso", 0);
                } else if (senha.length() <= 6) {
                    JOptionPane.showMessageDialog(null, "Senha muito pequena", "Aviso", 0);
                } else {
                    String login = tfuser.getText();
                    String email = tfemail.getText();
                    String cpf = tfcpf.getText();
                    Usuario u = new Usuario(cpf, login, senha, email);
                    b.cadastarAdmin(u);
                    p.salvarCentral(b);
                    JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
                }

            }

        });
        add(cadastrarButton);

        JButton cancelarButton = new JButton("CANCELAR", Imagens.CANCELAR_TELADECADASTRO_ICON);
        cancelarButton.setBounds(260, 370, 140, 40);
        cancelarButton.setFont(new Font("Quicksand", Font.BOLD, 12));
        cancelarButton.setForeground(new Color(74, 44, 131));
        cancelarButton.setBackground(new Color(255, 255, 255));
        cancelarButton.addActionListener(new ActionListener() {
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