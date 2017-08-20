/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

import util.GrafoListaAdjacencia;
import util.Vertice;

/**
 *
 * @author luanv
 */
public class Controller {

	private final GrafoListaAdjacencia grafo;
	private static Controller instancia;
	private Object[] informations;

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
			if (linha.charAt(0) != '#') {
				String[] informacoes = linha.split(",|,\\s");
				this.grafo.addVertex(informacoes[0]);
				this.grafo.addVertex(informacoes[1]);
				this.grafo.inserirAresta(informacoes[0], informacoes[1], Float.parseFloat(informacoes[2]));
			}
			linha = lerArq.readLine(); // lê da segunda até a última linha
		}
		arq.close();
		lerArq.close();
		this.salvarVertices();
	}

	public void lerPontos() throws IOException {
		FileReader arq = new FileReader("Coordenadas.txt");
		BufferedReader lerArq = new BufferedReader(arq);
		String linha = lerArq.readLine();
		HashMap<String, Point> pontos = new HashMap<String, Point>();
		while (linha != null) {
			if (linha.charAt(0) != '#') {
				String[] informacoes = linha.split(",|,\\s");
				pontos.put(informacoes[0],
						new Point(Integer.parseInt(informacoes[1]), Integer.parseInt(informacoes[2])));
			}
			linha = lerArq.readLine(); // lê da segunda até a última linha
		}
		for (Vertice v : this.grafo.getVertices()) {
			if (pontos.get(v.getInformacao()) != null) {
				// System.out.println(pontos.get(v.getInformacao()));
				v.setX(pontos.get(v.getInformacao()).x);
				v.setY(pontos.get(v.getInformacao()).y);
			}
		}
		arq.close();
		lerArq.close();
	}

	private void salvarVertices() {
		this.informations = new Object[this.grafo.getNumVertice()];
		int contador = 0;
		for (Vertice v : this.grafo.getVertices()) {
			this.informations[contador++] = v.getInformacao();
		}
		Arrays.sort(this.informations);
	}

	public Object[] getInformacoes() {
		return this.informations;
	}

	public ArrayList<Vertice> getVertices() {
		return this.grafo.getVertices();
	}

	public Stack<Object> menorCaminho(Object origem, Object destino) {
		return this.grafo.menorCaminho(origem, destino);
	}
}
