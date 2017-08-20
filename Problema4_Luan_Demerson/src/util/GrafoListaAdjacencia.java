/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author luanv
 */
public class GrafoListaAdjacencia {
	private ArrayList<Vertice> vertices;
	private int numVertice;
	private int posicao;

	public GrafoListaAdjacencia(Vertice u) {
		
		this.numVertice = 1;
		posicao = 0;
	}

	public ArrayList<Vertice> getVertices() {
		return vertices;
	}

	public int getNVertice() {
		return numVertice;
	}

	public int getNumVertice() {
		return this.numVertice;
	}

	public void addVertex(Vertice v) {
			vertices.add(v);
			posicao++;
	}

	public Comparable buscarVerticeInt(int index) {
		return index;
	}

	public int buscarVerticeComp(Comparable c) {
		return numVertice;
	}

	public double calcularTempoP(int a, int b) {
		Vertice p1 = vertices[a]; // Encontra-se o primeiro ponto.
		Vertice p2 = vertices[b]; // Encontra-se o segundo ponto.
		return Math.sqrt(Math.pow(Math.abs(p1.getX() - p2.getX()), 2) + Math.pow(Math.abs(p1.getY() - p2.getY()), 2));
	}

	public int calcularTempoL(ArrayList<Vertice> d) {
		int tempo = 0;
		return tempo;
	}

	public void inserirAresta(Comparable origem, Comparable destino) {
	}

	public boolean existeAresta(int origem, int destino) {
		return false;
	}

	public boolean removerAresta(int origem, int destino) {
		return false;
	}

	public int buscarAdj(int vert) {
		return vert;
	}

	public void imprimeMatriz() {
	}
}
