package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Persistencia{
 
    private XStream xs = new XStream(new DomDriver());
    private File arquivo = new File("Banco de Dados.xml");
    private static Persistencia persistencia = null;

    public void salvarCentral(BancoDeDados ci) {
		String xml = xs.toXML(ci);
		try {
			if ((arquivo.exists()) == false)
				arquivo.createNewFile();
			PrintWriter gravar = new PrintWriter(arquivo);
			gravar.print(xml);
			gravar.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public BancoDeDados recuperarCentral() {
		FileReader ler = null;
		try {
			if (arquivo.exists() == true) {
				ler = new FileReader(arquivo);
				return (BancoDeDados) xs.fromXML(ler);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return BancoDeDados.obterAInstancia();
	}

	public static Persistencia getPersistencia() {
		if (persistencia == null) {
			persistencia = new Persistencia();
		}
		return persistencia;
	}
    

}