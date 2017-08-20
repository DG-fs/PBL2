/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Demerson Sampaio
 */
public class GrafoListaAdjacencia {
	private ArrayList<Vertice> vertices;

	public GrafoListaAdjacencia() {
		this.vertices = new ArrayList<Vertice>();
	}

	public ArrayList<Vertice> getVertices() {
		return vertices;
	}

	public int getNumVertice() {
		return this.vertices.size();
	}

	public int getNumArestas() {
		int cont = 0;
		for (Vertice i : this.vertices) {
			cont += i.getNumArestas();
		}
		return cont / 2;
	}

	public void addVertex(Object stored) {
		if (!this.vertices.contains(new Vertice(stored)))
			this.vertices.add(new Vertice(stored));
	}

	private Vertice getVertice(Object busca) {
		for (Vertice achado : this.vertices) {
			if (achado.getInformacao() == busca)
				return achado;
		}
		return null;
	}

	public void inserirAresta(Object origem, Object destino, float peso) {
		if (this.vertices.contains(new Vertice(origem)) || this.vertices.contains(new Vertice(destino))) {
			Vertice first = this.getVertice(origem);
			Vertice second = this.getVertice(destino);
			if (!(first == null || second == null)) {
				first.addAdjacente(second, peso);
				second.addAdjacente(first, peso);
			}
		}
	}

	public Stack<Object> menorCaminho(Object origem, Object destino) {
		Vertice first = this.getVertice(origem);
		Vertice second = this.getVertice(destino);
		if ((first == null || second == null))
			return null;
		Dijkstra d = new Dijkstra(this, first);
		return d.menorCaminho(first, second);
	}

}
