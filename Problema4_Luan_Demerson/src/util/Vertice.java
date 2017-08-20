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
class Vertice {
	private Object info; // Object qualquer para ser armazenado alguma informação especial sobre o
								// vértice.
	private int x; // Coordenada do vértice no eixo X.
	private int y;
	private boolean visitado;
	ArrayList<Vertice> adjacentes;
	

	public Vertice(Object info, int x, int y) {
		super();
		this.info = info;
		this.x = x;
		this.y = y;
		this.visitado = false;
		this.adjacentes = new ArrayList<Vertice>();
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

	public ArrayList<Vertice> getAdjacentes() {
		return adjacentes;
	}

	public void setAdjacentes(ArrayList<Vertice> adjacentes) {
		this.adjacentes = adjacentes;
	}

}
