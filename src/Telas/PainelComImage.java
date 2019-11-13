package Telas;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;

public class PainelComImage extends JPanel {

    private Image fundo;

    public PainelComImage(String arquivo) {
        try {
            fundo = ImageIO.read(new File(arquivo));
        }catch(Exception e) {
            System.out.println("erro");
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fundo, 0, 0, this);
    }

}