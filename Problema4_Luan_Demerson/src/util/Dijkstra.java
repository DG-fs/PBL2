package util;

import java.util.PriorityQueue;
import java.util.Stack;

public class Dijkstra {
	private PriorityQueue<Vertice> proximosVertices;

	public Dijkstra(GrafoListaAdjacencia grafo, Vertice origem) {
		this.proximosVertices = new PriorityQueue<Vertice>();
		for (Vertice v : grafo.getVertices()) {
			v.setTamanhoCaminho(Float.MAX_VALUE);
			v.setAnterior(null);
			v.setVisitado(false);
			if (v.equals(origem))
				v.setTamanhoCaminho(0);
			this.proximosVertices.add(v);
		}
	}

	public Stack<Object> menorCaminho(Vertice origem, Vertice destino) {
		Stack<Object> retornaCaminho = new Stack<Object>();
		while (!proximosVertices.isEmpty()) {
			Vertice found = proximosVertices.poll();
			if (!found.isVisitado()) {
				for (Aresta adjacente : found.getAdjacentes()) {
					if (adjacente.getDestino().getTamanhoCaminho() > found.getTamanhoCaminho() + adjacente.getPeso()) {
						adjacente.getDestino().setTamanhoCaminho(found.getTamanhoCaminho() + adjacente.getPeso());
						adjacente.getDestino().setAnterior(found);
					}
				}
				found.setVisitado(true);
			}
		}
		Vertice ciclo = destino;
		if (ciclo.getAnterior() != null) {
			while (ciclo != null) {
				retornaCaminho.push(ciclo.getInfo());
				ciclo = ciclo.getAnterior();
			}
		}
		return retornaCaminho;
	}
}
