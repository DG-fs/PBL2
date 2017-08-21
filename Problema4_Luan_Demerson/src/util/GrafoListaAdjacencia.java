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
		vertices = new ArrayList<Vertice>();
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
		if (!vertices.contains(new Vertice(stored)))
			vertices.add(new Vertice(stored));
	}

	private Vertice getVertice(Object busca) {
		for (Vertice achado : vertices) {
			if (achado.getInfo().equals(busca))
				return achado;
		}
		return null;
	}

	public void inserirAresta(Object origem, Object destino, float peso) {
		if (vertices.contains(new Vertice(origem)) || vertices.contains(new Vertice(destino))) {
			Vertice first = getVertice(origem);
			Vertice second = getVertice(destino);
			if (!(first == null || second == null)) {
				first.addAdjacente(second, peso);
				second.addAdjacente(first, peso);
			}
		}
	}

	public Stack<Object> menorCaminho(Object origem, Object destino) {
		Vertice first = getVertice(origem);
		Vertice second = getVertice(destino);
		if ((first == null || second == null))
			return null;
		Dijkstra d = new Dijkstra(this, first);
		return d.menorCaminho(first, second);
	}

}
