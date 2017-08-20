package util;

import org.junit.Test;

import junit.framework.TestCase;

public class GrafoListaAdjacenciaTest extends TestCase {
	
	@Test
	public void testaConstroiGrafo() {
		GrafoListaAdjacencia graph = new GrafoListaAdjacencia();
		Vertice u = new Vertice ("b", 2, 2);
		
		graph.addVertex(u);
		graph.addEdge(1,v,u);
		
		assertEquals();
	}
}
