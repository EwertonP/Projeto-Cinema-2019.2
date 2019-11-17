package Util;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class SomenteNumeros extends JTextField {

    private static final long serialVersionUID = -5650089454479315379L;

    private int maximoCaracteres = -1;// definição de -1
    // como valor normal de um textfield sem limite de caracters

    private void setMaximoCaracteres(int maximo) {
    }

    private int getMaximoCaracteres() {
        return 0;
    }

    public SomenteNumeros() {
        super();
        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldKeyTyped(evt);
            }

            private void jTextFieldKeyTyped(KeyEvent evt) {
            }
        });
    }

    public SomenteNumeros(int maximo) {
        super();
        setMaximoCaracteres(maximo);// define o tamanho máximo
        // que deve ser aceito no jtextfield que foi recebido no construtor

        addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldKeyTyped(evt);
            }

            private void jTextFieldKeyTyped(KeyEvent evt) {
            }
        });
    }

    private void jTextFieldKeyTyped(KeyEvent evt) {

        String caracteres = "0987654321";// lista de caracters que não devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {// se o caracter que gerou o
            // evento estiver não estiver na lista
            evt.consume();// aciona esse propriedade para eliminar a ação do evento
        }
        if ((getText().length() >= getMaximoCaracteres()) && (getMaximoCaracteres() != -1)) {
            // if para saber se precisa verificar também o tamanho da string do campo
            // maior ou igual ao tamanho máximo, cancela e nao deixa inserir mais
            evt.consume();
            setText(getText().substring(0, getMaximoCaracteres()));
            // esta linha acima é para remover os caracters inválidos caso o usuário tenha
            // copiado o conteúdo de algum lugar, ou seja, com tamanho maior que o definido
        } // fim do if do tamanho da string do campo

    }

}