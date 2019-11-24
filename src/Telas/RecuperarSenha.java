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
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;
import javax.swing.text.MaskFormatter;

import Util.Imagens;

public class RecuperarSenha extends TelaPadrao {

    private static final long serialVersionUID = 1L;

    public RecuperarSenha() {
        setTitle("Recuperação de Senha");
        setResizable(false);
        adicionarImagem("Imagens\\bg tela de recuperacao.png");
        textfield();
        labels();
        botoes();
        setVisible(true);
        repaint();

    }

    private JTextField email;
    private JTextField cpf;

    public void textfield() {

        email = new JTextField();
        email.setFont(new Font("Quicksand", Font.BOLD, 12));
        email.setForeground(new Color(74, 44, 131));
        email.setBounds(130, 180, 240, 25);
        add(email);

        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            cpf = new JFormattedTextField(mascaraCPF);
            cpf.setFont(new Font("Quicksand", Font.BOLD, 12));
            cpf.setForeground(new Color(74, 44, 131));
            cpf.setBounds(130, 260, 240, 25);
            add(cpf);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void labels() {
        JLabel emailJLabel = new JLabel("E-mail:");
        emailJLabel.setBounds(130, 125, 150, 80);
        emailJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
        emailJLabel.setForeground(new Color(69, 38, 123));
        add(emailJLabel);

        JLabel cpfJLabel = new JLabel("CPF:");
        cpfJLabel.setBounds(130, 205, 150, 80);
        cpfJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
        cpfJLabel.setForeground(new Color(69, 38, 123));
        add(cpfJLabel);

        JLabel backJLabel = new JLabel(Imagens.BOTAO_BACK_ICON_TELADECADASTRO);
        backJLabel.setBounds(20, 20, 20, 20);
        backJLabel.addMouseListener(new MouseInputListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new TelaDeLogin();

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
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
        JButton recuperarButton = new JButton("RECUPERAR", Imagens.CADASTRAR_TELADECADASTRO_ICON);
        recuperarButton.setBounds(100, 340, 140, 40);
        recuperarButton.setFont(new Font("Quicksand", Font.CENTER_BASELINE, 12));
        recuperarButton.setForeground(new Color(255, 255, 255));
        recuperarButton.setBackground(new Color(74, 44, 131));
        add(recuperarButton);

        JButton cancelarButton = new JButton("CANCELAR", Imagens.CANCELAR_TELADECADASTRO_ICON);
        cancelarButton.setBounds(260, 340, 140, 40);
        cancelarButton.setFont(new Font("Quicksand", Font.BOLD, 12));
        cancelarButton.setForeground(new Color(74, 44, 131));
        cancelarButton.setBackground(new Color(255, 255, 255));
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaDeLogin();

            }
		});
        add(cancelarButton);
        
    }

    public static void main(String[] args) {
        new RecuperarSenha();
    }


    
}