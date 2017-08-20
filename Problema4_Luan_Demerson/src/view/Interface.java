/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import controller.Facade;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author luanv
 */
public class Interface {
    private JFrame tela;
    private Container container;
    private JButton btnProcurar;
    private JComboBox origem, destino, dia;
    private JLabel txtOrigem, txtDestino;
    private JPanel panelBaixo, panelCentro, panelLado;
    private JTextArea txtArea;
    private JScrollPane scrollpaneTopo;
    private Facade abrir;
    
    Controller controller = Controller.getInstance();
    
    public Interface(){
        tela = new JFrame("Metrô");
        container = new JPanel(new BorderLayout());
        panelBaixo = new JPanel(new FlowLayout());
        panelCentro = new JPanel(new BorderLayout());
        panelLado = new JPanel(new FlowLayout());
        scrollpaneTopo = new JScrollPane();
        
        btnProcurar = new JButton("Procurar Menores Rotas");

        origem = new JComboBox();
        origem.addItem("Selecione a Origem");
        destino = new JComboBox();
        destino.addItem("Selecione o Destino");
        txtOrigem = new JLabel("Origem: ");
        txtDestino = new JLabel("Destino: ");
        
        dia = new JComboBox();
        dia.addItem("Selecione o Dia");
        
        tela.add(container);
        container.add(panelBaixo, BorderLayout.SOUTH);
        container.add(panelCentro, BorderLayout.CENTER);
        container.add(panelLado, BorderLayout.EAST);

        
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(800, 600);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        scrollpaneTopo.setViewportView(txtArea);


        panelBaixo.add(txtOrigem);
        panelBaixo.add(origem);
        panelBaixo.add(txtDestino);
        panelBaixo.add(destino);
        panelBaixo.add(btnProcurar);
        panelLado.add(dia);
        panelCentro.add(scrollpaneTopo);
        
    }
    public static void main(String[] Args) {
        new Interface();
    }
    
    public void abrirArquivo(){
        File file = new File("MapaMetro.txt");
        abrir.abrirArquivo(file);
        }
       
}

