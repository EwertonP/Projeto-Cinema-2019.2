package Telas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.JComponent;
import javax.swing.JFrame;



public class TelaPadrao extends JFrame {

	class ImagePanel extends JComponent {
		private Image image;

		public ImagePanel(Image image) {
			this.image = image;
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this);
		}
	}

	public void adicionarImagem(String image) {
		try {
			BufferedImage myImage = ImageIO.read(new File(image));
			this.setContentPane(new ImagePanel(myImage));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	*
	*/
	private static final long serialVersionUID = -6026317575125391050L;

	public TelaPadrao() {
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	}
}
