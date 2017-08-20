package util;

import java.util.PriorityQueue;
import java.util.Stack;

public class Dijkstra {
	private PriorityQueue<Vertice> proximosVertices;
	
	public Dijkstra(GrafoListaAdjacencia grafo, Vertice origem) {
		this.proximosVertices = new PriorityQueue<Vertice>();
		for(Vertice v: grafo.getVertices()) {
			v.setTamanhoCaminho(Float.MAX_VALUE);
			v.setAnterior(null);
			if(v == origem)
				v.setTamanhoCaminho(0);
			this.proximosVertices.add(v);
		}
	}
	
	public Stack<Object> menorCaminho(Vertice origem, Vertice destino){
		Stack<Object> retornaCaminho = new Stack<Object>();
		while(!this.proximosVertices.isEmpty()) {
			Vertice found = this.proximosVertices.poll();
			if(!found.isVisitado()) {
				for(Aresta adjacente : found.getAdjacentes()) {
					if(adjacente.getDestino().getTamanhoCaminho() > found.getTamanhoCaminho() + adjacente.getPeso()) {
						adjacente.getDestino().setTamanhoCaminho(found.getTamanhoCaminho() + adjacente.getPeso());
						adjacente.getDestino().setAnterior(found);
					}
				}
			}
		}
		Vertice ciclo = destino;
		if(ciclo.getAnterior() != null) {
			System.out.println(ciclo.getInformacao());
			while(ciclo != null) {
				retornaCaminho.push(ciclo.getInformacao());
				ciclo = ciclo.getAnterior();
			}
		}
		return retornaCaminho;
	}
}
