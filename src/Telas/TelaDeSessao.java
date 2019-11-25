package Telas;

/**
 * TelaDeSessao
 */
public class TelaDeSessao extends TelaPadrao{


    public TelaDeSessao() {
        setTitle("Cadastro de Sessão");
		setResizable(false);
		adicionarImagem("Imagens\\bg tela de sessao.png");
		setVisible(true);
		repaint();
    }



    public static void main(String[] args) {
        new TelaDeSessao();
    }



    
}