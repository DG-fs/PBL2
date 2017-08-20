package util;

import java.util.Stack;

import org.junit.Test;

import junit.framework.TestCase;
import util.GrafoListaAdjacencia;

public class GrafoListaAdjacenciaTest extends TestCase {

	@Test
	public void testaConstroiGrafo() {
		GrafoListaAdjacencia littleGraph = new GrafoListaAdjacencia();

		littleGraph.addVertex("A");
		littleGraph.addVertex("B");
		littleGraph.addVertex("C");
		littleGraph.addVertex("D");
		littleGraph.addVertex("E");
		littleGraph.addVertex("F");

		littleGraph.inserirAresta("A", "B", 3);
		littleGraph.inserirAresta("A", "F", 5);
		littleGraph.inserirAresta("B", "F", 1);
		littleGraph.inserirAresta("F", "C", 2);
		littleGraph.inserirAresta("F", "E", 2);
		littleGraph.inserirAresta("C", "E", 4);
		littleGraph.inserirAresta("C", "D", 5);

		assertEquals(6, littleGraph.getNumVertice());
		assertEquals(7, littleGraph.getNumArestas());
	}

	@Test
	public void testDjkstra() {
		GrafoListaAdjacencia littleGraph = new GrafoListaAdjacencia();

		littleGraph.addVertex("A");
		littleGraph.addVertex("B");
		littleGraph.addVertex("C");
		littleGraph.addVertex("D");
		littleGraph.addVertex("E");
		littleGraph.addVertex("F");

		littleGraph.inserirAresta("A", "B", 3);
		littleGraph.inserirAresta("A", "F", 5);
		littleGraph.inserirAresta("B", "F", 1);
		littleGraph.inserirAresta("F", "C", 2);
		littleGraph.inserirAresta("F", "E", 2);
		littleGraph.inserirAresta("C", "E", 4);
		littleGraph.inserirAresta("C", "D", 5);

		Stack<Object> test = littleGraph.menorCaminho("A", "D");

		String[] expected = { "A", "B", "F", "C", "D" };
		int count = 0;
		assertFalse(test.isEmpty());
		while (!test.isEmpty()) {
			assertEquals(expected[count], test.pop());
			count += 1;
		}
		assertEquals(5, count);
	}
}
