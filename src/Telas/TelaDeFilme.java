package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Logica.BancoDeDados;
import Logica.Filme;
import Logica.Persistencia;
import Util.Imagens;

/**
 * TelaDeFilme
 */
public class TelaDeFilme extends TelaPadrao {

    public TelaDeFilme() {
        setSize(500, 600);
        setTitle("Cadastro de Filmes");
        setResizable(false);
        adicionarImagem("Imagens\\bg tela de filme.png");
        caixaDeTexto();
        labels();
        combobox();
        textoSinopse();
        botoes();
        setVisible(true);
        repaint();

    }

    private JTextField tfNome;
    private JComboBox classificacao;
    private JTextField tfgenero;
    private JTextField duracaoDoFilme;
    private JTextArea sinopseText;

    Persistencia p = new Persistencia();
    BancoDeDados b = p.recuperarCentral();

    String[] clas = { "", "Livre", "10", "12", "14", "16", "18" };

    public void caixaDeTexto() {
        tfNome = new JTextField();
        tfNome.setFont(new Font("Quicksand", Font.BOLD, 12));
        tfNome.setForeground(new Color(74, 44, 131));
        tfNome.setBounds(130, 190, 240, 25);
        add(tfNome);

        tfgenero = new JTextField();
        tfgenero.setFont(new Font("Quicksand", Font.BOLD, 12));
        tfgenero.setForeground(new Color(74, 44, 131));
        tfgenero.setBounds(130, 240, 240, 25);
        add(tfgenero);

        duracaoDoFilme = new JTextField();
        duracaoDoFilme.setFont(new Font("Quicksand", Font.BOLD, 12));
        duracaoDoFilme.setForeground(new Color(74, 44, 131));
        duracaoDoFilme.setBounds(250, 290, 120, 25);
        add(duracaoDoFilme);
    }

    public void labels() {
        final JLabel nomeJLabel = new JLabel("Titulo do Filme:");
        nomeJLabel.setBounds(130, 135, 150, 80);
        nomeJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
        nomeJLabel.setForeground(new Color(69, 38, 123));
        add(nomeJLabel);

        final JLabel generoJLabel = new JLabel("Gênero do Filme:");
        generoJLabel.setBounds(130, 185, 150, 80);
        generoJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
        generoJLabel.setForeground(new Color(69, 38, 123));
        add(generoJLabel);

        final JLabel classisficacaoJLabel = new JLabel("Classificação:");
        classisficacaoJLabel.setBounds(130, 235, 150, 80);
        classisficacaoJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
        classisficacaoJLabel.setForeground(new Color(69, 38, 123));
        add(classisficacaoJLabel);

        final JLabel duracaoJLabel = new JLabel("Duração:");
        duracaoJLabel.setBounds(250, 235, 150, 80);
        duracaoJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
        duracaoJLabel.setForeground(new Color(69, 38, 123));
        add(duracaoJLabel);

        final JLabel sinopseJLabel = new JLabel("Sinopse:");
        sinopseJLabel.setBounds(130, 285, 150, 80);
        sinopseJLabel.setFont(new Font("Quicksand", Font.BOLD, 14));
        sinopseJLabel.setForeground(new Color(69, 38, 123));
        add(sinopseJLabel);
    }

    public void combobox() {
        classificacao = new JComboBox<>(clas);
        classificacao.setBounds(130, 290, 100, 25);
        classificacao.setBackground(Color.WHITE);
        add(classificacao);
    }

    public void textoSinopse() {
        sinopseText = new JTextArea("Digite a sinopse aqui");
        sinopseText.addFocusListener(new FocusListener() {

            public void focusLost(FocusEvent arg0) {
                if (sinopseText.getText().isEmpty()) {
                    sinopseText.setText("Digite a sinopse aqui");
                }
            }

            public void focusGained(FocusEvent arg0) {
                if (sinopseText.getText().equals("Digite a sinopse aqui")) {
                    sinopseText.setText("");
                }
            }
        });

        sinopseText.setLineWrap(true);
        sinopseText.setWrapStyleWord(true);

        JScrollPane painelComRolagem = new JScrollPane(sinopseText);
        painelComRolagem.setBounds(130, 340, 240, 100);
        sinopseText.setFont(new Font("Quicksand", Font.CENTER_BASELINE, 12));
        sinopseText.setForeground(new Color(69, 38, 123));

        add(painelComRolagem);
    }

    public void botoes() {
        JButton cadastrarButton = new JButton("CADASTRAR", Imagens.CADASTRAR_TELADECADASTRO_ICON);
        cadastrarButton.setBounds(100, 480, 140, 40);
        cadastrarButton.setFont(new Font("Quicksand", Font.BOLD, 12));
        cadastrarButton.setForeground(new Color(255, 255, 255));
        cadastrarButton.setBackground(new Color(74, 44, 131));
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemSelecionado = classificacao.getSelectedIndex();
                if (tfNome.getText().isEmpty() || tfgenero.getText().isEmpty() || itemSelecionado <= 0
                        || duracaoDoFilme.getText().isEmpty() || sinopseText.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não deixe nada em branco!", "Cuidado",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    String nome = tfNome.getText();
                    String genero = tfgenero.getText();
                    int classficacao = Integer.parseInt(clas[itemSelecionado]);
                    String duracao = duracaoDoFilme.getText();
                    String sinopse = sinopseText.getText();
                    Filme filme = new Filme(duracao, nome, genero, classficacao, sinopse);
                    b.cadastrarFilme(filme);
                    p.salvarCentral(b);
                    JOptionPane.showMessageDialog(null, "Filme cadastrado", "goocine",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
        add(cadastrarButton);

        JButton cancelarButton = new JButton("CANCELAR", Imagens.CANCELAR_TELADECADASTRO_ICON);
        cancelarButton.setBounds(260, 480, 140, 40);
        cancelarButton.setFont(new Font("Quicksand", Font.BOLD, 12));
        cancelarButton.setForeground(new Color(74, 44, 131));
        cancelarButton.setBackground(new Color(255, 255, 255));
        add(cancelarButton);

    }

    public static void main(final String[] args) {
        new TelaDeFilme();
    }

}