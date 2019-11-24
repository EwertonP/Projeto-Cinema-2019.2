package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MouseInputListener;

import Util.Imagens;

public class TelaHome extends TelaPadrao {

    private static final long serialVersionUID = 1L;

    public TelaHome() {
        setTitle("Tela Principal");
        setSize(850, 700);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        adicionarImagem("Imagens\\bg tela home.png");
        cadastros();
        atualizarTabela();
        //adicionarMenu();
        setVisible(true);
        repaint();
    }

    public void adicionarMenu() {
        JMenuBar barraDeMenu = new JMenuBar();
        barraDeMenu.setBackground(Color.WHITE);
        //setJMenuBar(barraDeMenu);

        JMenu cadastroMenu = new JMenu("Cadastro");
        cadastroMenu.setForeground(new Color(74, 44, 131));
        cadastroMenu.setFont(new Font("Quicksand", Font.BOLD, 14));
        barraDeMenu.add(cadastroMenu);

        JMenuItem cadastrarUsuario = new JMenuItem("Novo Usuário");
        cadastrarUsuario.setFont(new Font("Quicksand", Font.BOLD, 14));
        cadastrarUsuario.setForeground(new Color(74, 44, 131));
        cadastrarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaDeCadastro();
                String comando = new String(e.getActionCommand().toUpperCase());
                switch (comando) {
                case "CANCELAR":
                    dispose();
                    break;
                }

            }
        });
        cadastroMenu.add(cadastrarUsuario);

        JMenuItem cadastrarSessao = new JMenuItem("Nova Sessão");
        cadastrarSessao.setFont(new Font("Quicksand", Font.BOLD, 14));
        cadastrarSessao.setForeground(new Color(74, 44, 131));
        cadastroMenu.add(cadastrarSessao);

        JMenuItem cadastrarSala = new JMenuItem("Nova Sala");
        cadastrarSala.setFont(new Font("Quicksand", Font.BOLD, 14));
        cadastrarSala.setForeground(new Color(74, 44, 131));
        cadastroMenu.add(cadastrarSala);

        JMenuItem cadastrarFilme = new JMenuItem("Novo Filme");
        cadastrarFilme.setFont(new Font("Quicksand", Font.BOLD, 14));
        cadastrarFilme.setForeground(new Color(74, 44, 131));
        cadastroMenu.add(cadastrarFilme);


    }

    public void cadastros() {
        JLabel cadastroGrupo = new JLabel(Imagens.CADASTRAR_TELA_HOME);
        cadastroGrupo.setText("Cadastros");
        cadastroGrupo.setBounds(25, 200, 125, 40);
        cadastroGrupo.setFont(new Font("Quicksand", Font.BOLD, 18));
        cadastroGrupo.setForeground(Color.WHITE);
        add(cadastroGrupo);

        JLabel cadastroSala = new JLabel();
        cadastroSala.setText("Cadastrar Sala");
        cadastroSala.setBounds(55, 240, 120, 40);
        cadastroSala.setFont(new Font("Quicksand", Font.BOLD, 16));
        cadastroSala.setForeground(Color.WHITE);
        add(cadastroSala);

        JLabel cadastroSessao = new JLabel();
        cadastroSessao.setText("Cadastrar Sessão");
        cadastroSessao.setBounds(55, 270, 150, 40);
        cadastroSessao.setFont(new Font("Quicksand", Font.BOLD, 16));
        cadastroSessao.setForeground(Color.WHITE);
        add(cadastroSessao);

        JLabel cadastroFilme = new JLabel();
        cadastroFilme.setText("Cadastrar Filme");
        cadastroFilme.setBounds(55, 300, 150, 40);
        cadastroFilme.setFont(new Font("Quicksand", Font.BOLD, 16));
        cadastroFilme.setForeground(Color.WHITE);
        add(cadastroFilme);

        JLabel cadastroUser = new JLabel();
        cadastroUser.setText("Cadastrar Usuário");
        cadastroUser.setBounds(55, 330, 150, 40);
        cadastroUser.setFont(new Font("Quicksand", Font.BOLD, 16));
        cadastroUser.setForeground(Color.WHITE);
        add(cadastroUser);
    }

    public void atualizarTabela() {
        JLabel atualizar = new JLabel(Imagens.ICON_ATUALIZAR);
        atualizar.setText("Atualizar Tabela");
        atualizar.setFont(new Font("Quicksand", Font.BOLD, 18));
        atualizar.setBounds(25, 385, 180, 20);
        atualizar.setForeground(Color.WHITE);
        atualizar.addMouseListener(new MouseInputListener() {

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
                //repaint();

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
        add(atualizar);
    }

    public static void main(String[] args) {
        new TelaHome();
    }
}