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
        setTitle("Bem-Vindo");
        setSize(850, 700);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        adicionarImagem("Imagens\\bg tela home.png");
        cadastros();
        atualizarTabela();
        enviarEmail();
        listarGrupo();
        gerarRelatorio();
        sair();
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
        cadastroSala.setBounds(60, 230, 120, 30);
        cadastroSala.setFont(new Font("Quicksand", Font.BOLD, 14));
        cadastroSala.setForeground(Color.WHITE);
        cadastroSala.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                cadastroSala.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                cadastroSala.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(cadastroSala);

        JLabel cadastroSessao = new JLabel();
        cadastroSessao.setText("Cadastrar Sessão");
        cadastroSessao.setBounds(60, 260, 150, 30);
        cadastroSessao.setFont(new Font("Quicksand", Font.BOLD, 14));
        cadastroSessao.setForeground(Color.WHITE);
        cadastroSessao.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                cadastroSessao.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                cadastroSessao.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(cadastroSessao);

        JLabel cadastroFilme = new JLabel();
        cadastroFilme.setText("Cadastrar Filme");
        cadastroFilme.setBounds(60, 290, 150, 30);
        cadastroFilme.setFont(new Font("Quicksand", Font.BOLD, 14));
        cadastroFilme.setForeground(Color.WHITE);
        cadastroFilme.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                cadastroFilme.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                cadastroFilme.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(cadastroFilme);

        JLabel cadastroUser = new JLabel();
        cadastroUser.setText("Cadastrar Usuário");
        cadastroUser.setBounds(60, 320, 150, 30);
        cadastroUser.setFont(new Font("Quicksand", Font.BOLD, 14));
        cadastroUser.setForeground(Color.WHITE);
        cadastroUser.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                cadastroUser.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                cadastroUser.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                new TelaDeCadastro();
                
            }
        });
        add(cadastroUser);
    }

    public void atualizarTabela() {
        JLabel atualizar = new JLabel(Imagens.ICON_ATUALIZAR);
        atualizar.setText("Atualizar Tabela");
        atualizar.setFont(new Font("Quicksand", Font.BOLD, 18));
        atualizar.setBounds(20, 365, 180, 20);
        atualizar.setForeground(Color.WHITE);
        atualizar.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                atualizar.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                atualizar.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(atualizar);
    }

    public void enviarEmail() {
        JLabel enviarEmail = new JLabel(Imagens.ICON_EMAIL);
        enviarEmail.setText("Email Marketing");
        enviarEmail.setFont(new Font("Quicksand", Font.BOLD, 18));
        enviarEmail.setBounds(25, 405, 180, 20);
        enviarEmail.setForeground(Color.WHITE);
        enviarEmail.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                enviarEmail.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                enviarEmail.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(enviarEmail);
    }

    public void listarGrupo() {
        JLabel lista = new JLabel(Imagens.ICON_LISTAR);
        lista.setText("Listar");
        lista.setFont(new Font("Quicksand", Font.BOLD, 18));
        lista.setBounds(0, 440, 140, 30);
        lista.setForeground(Color.WHITE);
        add(lista);

        JLabel listarFilmes = new JLabel("Listar Filmes");
        listarFilmes.setBounds(60, 465, 120, 40);
        listarFilmes.setFont(new Font("Quicksand", Font.BOLD, 14));
        listarFilmes.setForeground(Color.WHITE);
        listarFilmes.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                listarFilmes.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                listarFilmes.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(listarFilmes);

        JLabel listarSessao = new JLabel("Listar Sessões");
        listarSessao.setBounds(60, 495, 140, 40);
        listarSessao.setFont(new Font("Quicksand", Font.BOLD, 14));
        listarSessao.setForeground(Color.WHITE);
        listarSessao.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                listarSessao.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                listarSessao.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(listarSessao);

        JLabel listarSalas = new JLabel("Listar Salas");
        listarSalas.setBounds(60, 525, 140, 40);
        listarSalas.setFont(new Font("Quicksand", Font.BOLD, 14));
        listarSalas.setForeground(Color.WHITE);
        listarSalas.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                listarSalas.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                listarSalas.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(listarSalas);
    }

    public void gerarRelatorio() {
        JLabel relatorio = new JLabel(Imagens.ICON_RELATORIO);
        relatorio.setText("Gerar Relatório");
        relatorio.setFont(new Font("Quicksand", Font.BOLD, 18));
        relatorio.setBounds(25, 560, 170, 30);
        relatorio.setForeground(Color.WHITE);
        relatorio.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                relatorio.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                relatorio.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(relatorio);
        
    }

    public void sair() {
        JLabel sair = new JLabel(Imagens.ICON_SAIR);
        sair.setText("Sair");
        sair.setFont(new Font("Quicksand", Font.BOLD, 18));
        sair.setBounds(25, 600, 70, 30);
        sair.setForeground(Color.WHITE);
        sair.addMouseListener(new MouseInputListener(){
        
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
                
                
            }
        
            @Override
            public void mouseExited(MouseEvent e) {
                sair.setForeground(Color.WHITE);
                
            }
        
            @Override
            public void mouseEntered(MouseEvent e) {
                sair.setForeground(new Color(114, 71, 180));
                
            }
        
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
        add(sair);

    }

    public static void main(String[] args) {
        new TelaHome();
    }
}