package util;

import java.util.PriorityQueue;

public class Dijkstra {
	private PriorityQueue<Vertice> proximosVertices;
	
	public Dijkstra(GrafoListaAdjacencia grafo) {
		this.proximosVertices = new PriorityQueue<Vertice>();
		for(Vertice v: grafo.getVertices()) {
			v.setTamanhoCaminho(Float.MAX_VALUE);
			v.setAnterior(null);
		}
	}
}
