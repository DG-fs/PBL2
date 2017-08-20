package view;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

import controller.Controller;
import util.Aresta;
import util.Vertice;

public class DesenhaMapa extends JPanel {

	/**
	 * Para serialização
	 */
	private static final long serialVersionUID = 1061385846862849538L;
	
	public DesenhaMapa(BorderLayout borderLayout) {
		super(borderLayout);
	}

	@Override
	public void paintComponent(Graphics g) {
		BasicStroke dashed = new BasicStroke((float) 6); // Objeto para engrossar as linhas que serão desenhadas.
		((Graphics2D) g).setStroke(dashed); // Engrossa as linhas
		g.setColor(Color.red); // Define a cor como cinza
		ArrayList<Vertice> allVertex = Controller.getInstance().getVertices(); // Pega todos os vértices do grafo.

		for (int i = 0; i < allVertex.size(); i++) {
			System.out.println(allVertex.get(i).getX());
			Point p1 = new Point(allVertex.get(i).getX(), allVertex.get(i).getY()); // Pega as coordenadas de determinado vértice.
			g.fillOval(p1.x, p1.y, 12, 12); // Desenha um ponto nessa coordenada
			ArrayList<Aresta> edges = allVertex.get(i).getAdjacentes(); // Verifica as ligações que este vértice tem

			for (int j = 0; j < edges.size(); j++) { // Desenha as ligações entre os vértice adjacentes
				if (edges.get(j) != null && edges.get(j).getDestino() != null) {
					Point p2 = new Point(edges.get(j).getDestino().getX(), edges.get(j).getDestino().getY()); // Pega o vértice adjacente
					g.drawLine(p1.x + 6, p1.y + 6, p2.x + 6, p2.y + 6); // Liga os vértices
				}
				
			}
			
		}
	}
}
