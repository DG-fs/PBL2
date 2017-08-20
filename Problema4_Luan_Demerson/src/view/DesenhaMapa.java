package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JPanel;

import com.sun.javafx.geom.Edge;

import controller.Controller;
import util.Vertice;

public class DesenhaMapa extends JPanel {

	/**
	 * Para serializa��o
	 */
	private static final long serialVersionUID = 1061385846862849538L;
	
	@Override
	public void paintComponent(Graphics g) {
		BasicStroke dashed = new BasicStroke((float) 6); // Objeto para engrossar as linhas que ser�o desenhadas.
		((Graphics2D) g).setStroke(dashed); // Engrossa as linhas
		g.setColor(Color.gray); // Define a cor como cinza
		ArrayList<Vertice> allVertex = Controller.getInstance().getVertices(); // Pega todos os v�rtices do grafo.

		for (int i = 0; i < allVertex.size(); i++) {

			Point p1 = new Point(allVertex.get(i).getX(), allVertex.get(i).getY()); // Pega as coordenadas de determinado v�rtice.
			g.fillOval(p1.x, p1.y, 12, 12); // Desenha um ponto nessa coordenada
			Edge[] edges = allVertex[i].getEdges(); // Verifica as liga��es que este v�rtice tem

			for (int j = 0; j < edges.length; j++) { // Desenha as liga��es entre os v�rtice adjacentes

				if (edges[j] != null && edges[j].getVertex() != null) {
					Point p2 = points.get(edges[j].getVertex().getVertexName()); // Pega o v�rtice adjacente
					g.drawLine(p1.x + 6, p1.y + 6, p2.x + 6, p2.y + 6); // Liga os v�rtices
				}
				
			}
			
		}
	}
}
