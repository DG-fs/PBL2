/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controller.Controller;

/**
 *
 * @author Demerson Sampaio
 */
public class Interface {
	private JFrame tela;
	private Container container;
	private JButton btnProcurar;
	private JComboBox<Object> origem, destino, dia;
	private JLabel txtOrigem, txtDestino;
	private JPanel panelBaixo, panelCentro, panelLado;
	private JTextArea txtArea;
	private JScrollPane scrollpaneTopo;

	Controller controller = Controller.getInstance();

	public Interface() {
		setTela(new JFrame("Metrô"));
		getTela().setTitle("Metr\u00F4");
		container = new JPanel(new BorderLayout());
		panelBaixo = new JPanel(new FlowLayout());
		panelCentro = new DesenhaMapa(new BorderLayout());
		panelLado = new JPanel(new FlowLayout());
		scrollpaneTopo = new JScrollPane();

		btnProcurar = new JButton("Procurar Menores Rotas");
		btnProcurar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Stack<Object> s = Controller.getInstance().menorCaminho(origem.getSelectedItem(),
						destino.getSelectedItem());
				while (!s.isEmpty()) {
					System.out.println(s.pop());
				}
				panelCentro.repaint();
			}
		});

		origem = new JComboBox<Object>();
		origem.setModel(new DefaultComboBoxModel<Object>(Controller.getInstance().getInformacoes()));
		destino = new JComboBox<Object>();
		destino.setModel(new DefaultComboBoxModel<Object>(Controller.getInstance().getInformacoes()));
		txtOrigem = new JLabel("Origem: ");
		txtDestino = new JLabel("Destino: ");

		dia = new JComboBox<Object>();
		dia.addItem("Selecione o Dia");

		getTela().getContentPane().add(container);
		container.add(panelBaixo, BorderLayout.SOUTH);
		container.add(panelCentro, BorderLayout.CENTER);
		container.add(panelLado, BorderLayout.EAST);

		getTela().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getTela().setSize(800, 600);
		getTela().setLocationRelativeTo(null);
		getTela().setVisible(true);

		scrollpaneTopo.setViewportView(txtArea);

		panelBaixo.add(txtOrigem);
		panelBaixo.add(origem);
		panelBaixo.add(txtDestino);
		panelBaixo.add(destino);
		panelBaixo.add(btnProcurar);
		panelLado.add(dia);
		panelCentro.add(scrollpaneTopo);
		/*
		 * JScrollPane p = new JScrollPane(); JLabel mapa = new JLabel();
		 * mapa.setIcon(new ImageIcon("Mapa.png")); p.setViewportView(mapa);
		 * panelCentro.add(p);
		 */

	}

	public JFrame getTela() {
		return tela;
	}

	public void setTela(JFrame tela) {
		this.tela = tela;
	}

}
