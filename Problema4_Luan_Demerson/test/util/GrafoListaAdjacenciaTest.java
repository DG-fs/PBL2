package util;

import org.junit.Test;

import junit.framework.TestCase;

public class GrafoListaAdjacenciaTest extends TestCase {
	
	@Test
	public void testaConstroiGrafo() {
		Vertice v = new Vertice("a", 1, 1);
		GrafoListaAdjacencia graph = new GrafoListaAdjacencia(v);
		Vertice u = new Vertice ("b", 2, 2);
		
		graph.addVertex(u);
		graph.addEdge(1,v,u);
		
		assertEquals();
	}
}
