/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author luanv
 */
public class Controller {
	public ArrayList<Vertice> arquivo = new ArrayList<Vertice>();

	public ArrayList<Vertice> ImportarArq() {
		try {
			FileReader arq = new FileReader("MapaMetro.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			while (linha != null) {

				System.out.printf("%s\n", linha);
				arquivo.inserirFinal(arq);
				linha = lerArq.readLine(); // lê da segunda até a última linha

			}

			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		return arquivo;
	}

	String[] importarArquivo(File file) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

}
