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
	private Object[] info;

	private Controller() {
		this.grafo = new GrafoListaAdjacencia();
	}

	public static Controller getInstance() {
		if (instancia == null)
			instancia = new Controller();
		return instancia;
	}

	public void ImportarArq() throws IOException {
		BufferedReader lerArq = new BufferedReader(new FileReader("MapaMetro.txt"));
		String linha = lerArq.readLine();
		while (linha != null) {
			if (linha.charAt(0) != '#') {
				String[] informacoes = linha.split(",|,\\s");
				grafo.addVertex(informacoes[0]);
				grafo.addVertex(informacoes[1]);
				grafo.inserirAresta(informacoes[0], informacoes[1], Float.parseFloat(informacoes[2]));
			}
			linha = lerArq.readLine();
		}
		lerArq.close();
		salvarVertices();
	}

	public void lerPontos() throws IOException {
		BufferedReader lerArq = new BufferedReader(new FileReader("Coordenadas.txt"));
		String linha = lerArq.readLine();
		HashMap<String, Point> pontos = new HashMap<String, Point>();
		while (linha != null) {
			if (linha.charAt(0) != '#') {
				String[] informacoes = linha.split(",|,\\s");
				pontos.put(informacoes[0], new Point(Integer.parseInt(informacoes[1]), Integer.parseInt(informacoes[2])));				
			}
			linha = lerArq.readLine(); // lê da segunda até a última linha
		}
		for (Vertice v : grafo.getVertices()) {
			if (pontos.get(v.getInfo()) != null) {
				v.setX(pontos.get(v.getInfo()).x);
				v.setY(pontos.get(v.getInfo()).y);
			}
		}	
		lerArq.close();
	}

	private void salvarVertices() {
		info = new Object[grafo.getNumVertice()];
		int contador = 0;
		for (Vertice v : grafo.getVertices()) {
			info[contador++] = v.getInfo();
		}
		Arrays.sort(info);
	}

	public Object[] getInformacoes() {
		return info;
	}

	public ArrayList<Vertice> getVertices() {
		return grafo.getVertices();
	}

	public Stack<Object> menorCaminho(Object origem, Object destino) {
		return grafo.menorCaminho(origem, destino);
	}
}
