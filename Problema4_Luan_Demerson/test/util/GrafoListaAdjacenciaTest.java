package util;

import org.junit.Test;

import junit.framework.TestCase;

public class GrafoListaAdjacenciaTest extends TestCase {

	@Test
	public void testaConstroiGrafo() {
		GrafoListaAdjacencia graph = new GrafoListaAdjacencia();

		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
	
		graph.inserirAresta("A", "B", 3);
		graph.inserirAresta("A", "F", 5);
		graph.inserirAresta("B", "F", 1);
		graph.inserirAresta("F", "C", 2);
		graph.inserirAresta("F", "E", 2);
		graph.inserirAresta("C", "E", 4);
		graph.inserirAresta("C", "D", 5);
		
		assertEquals(6, graph.getNumVertice());
		assertEquals(7, graph.getNumArestas());
	}
}
