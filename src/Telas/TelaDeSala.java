package Telas;

/**
 * TelaDeSala
 */
public class TelaDeSala extends TelaPadrao{


    public TelaDeSala() {
        setTitle("Cadastro de Salas");
		setResizable(false);
		adicionarImagem("Imagens\\bg tela de sessao.png");
		setVisible(true);
		repaint();
    }

    public static void main(String[] args) {
        new TelaDeSala();
    }

    
}