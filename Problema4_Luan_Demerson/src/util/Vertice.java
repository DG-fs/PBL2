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
public class Vertice implements Comparable<Vertice> {
	private Object info; // Object qualquer para ser armazenado alguma informação especial sobre o
							// vértice.
	private int x; // Coordenada do vértice no eixo X.
	private int y;
	private boolean visitado;
	ArrayList<Aresta> adjacentes;
	private float tamanhoCaminho;
	private Vertice anterior;

	public Vertice(Object info, int x, int y) {
		super();
		this.info = info;
		this.x = x;
		this.y = y;
		this.visitado = false;
		this.adjacentes = new ArrayList<Aresta>();
	}

	public Vertice(Object info) {
		super();
		this.info = info;
		this.x = 0;
		this.y = 0;
		this.visitado = false;
		this.adjacentes = new ArrayList<Aresta>();
	}

	public Object getInformacao() {
		return info;
	}

	public void setInformacao(Object informacao) {
		this.info = informacao;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public void addAdjacente(Vertice adicionado, float peso) {
		this.adjacentes.add(new Aresta(this, adicionado, peso));
	}

	public ArrayList<Aresta> getAdjacentes() {
		return adjacentes;
	}

	public int getNumArestas() {
		return this.adjacentes.size();
	}

	@Override
	public boolean equals(Object obj) {
		return this.info.equals(((Vertice) obj).getInformacao());
	}

	public float getTamanhoCaminho() {
		return tamanhoCaminho;
	}

	public void setTamanhoCaminho(float tamanhoCaminho) {
		this.tamanhoCaminho = tamanhoCaminho;
	}

	public Vertice getAnterior() {
		return anterior;
	}

	public void setAnterior(Vertice anterior) {
		this.anterior = anterior;
	}

	@Override
	public int compareTo(Vertice o) {
		return (this.visitado && o.isVisitado()) ? 0 :
			((this.visitado && !o.isVisitado()) ? -1 :
				(!this.visitado && o.isVisitado()) ? 1 : (!this.visitado && !o.isVisitado()) ? 
						((this.tamanhoCaminho < o.getTamanhoCaminho()) ? 1 : -1));
	}
	
}
