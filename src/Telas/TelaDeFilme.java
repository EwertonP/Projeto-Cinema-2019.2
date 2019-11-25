package Telas;

/**
 * TelaDeFilme
 */
public class TelaDeFilme extends TelaPadrao{


    public TelaDeFilme() {
        setTitle("Cadastro de Filmes");
		setResizable(false);
		adicionarImagem("Imagens\\bg tela de filme.png");
		setVisible(true);
		repaint();
    }

    public static void main(String[] args) {
        new TelaDeFilme();
    }

    
}