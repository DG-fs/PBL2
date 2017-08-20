/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

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

	public void addVertex(Object stored) {
		this.vertices.add(new Vertice(stored));
	}

	public int calcularTempoL(ArrayList<Vertice> d) {
		int tempo = 0;
		return tempo;
	}
	
	private Vertice getVertice(Object busca) {
		for(Vertice achado : this.vertices) {
			if(achado.getInformacao() == busca)
				return achado;
		}
		return null;
	}

	public void inserirAresta(Object origem, Object destino) {
		if(this.vertices.contains(new Vertice(origem)) || this.vertices.contains(new Vertice(destino))) {
			Vertice first = this.getVertice(origem);
			Vertice second = this.getVertice(destino);
			first.addAdjacente(second);
			second.addAdjacente(first);
		}
	}

}
