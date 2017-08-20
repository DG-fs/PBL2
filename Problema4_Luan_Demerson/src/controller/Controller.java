/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import util.GrafoListaAdjacencia;

/**
 *
 * @author luanv
 */
public class Controller {

	private final GrafoListaAdjacencia grafo;
	private static Controller instancia;

	private Controller() {
		this.grafo = new GrafoListaAdjacencia();
	}

	public static Controller getInstance() {
		if (instancia == null)
			instancia = new Controller();
		return instancia;
	}

	public void ImportarArq() throws IOException {
		FileReader arq = new FileReader("MapaMetro.txt");
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = lerArq.readLine();
		while (linha != null) {
			if(linha.charAt(0) != '#') {
				String[] informacoes = linha.split(",|,\\s");
				this.grafo.addVertex(informacoes[0]);
				this.grafo.addVertex(informacoes[1]);
				this.grafo.inserirAresta(informacoes[0], informacoes[1], Float.parseFloat(informacoes[2]));
			}
			linha = lerArq.readLine(); // lê da segunda até a última linha
		}
		arq.close();
		lerArq.close();
	}

}
