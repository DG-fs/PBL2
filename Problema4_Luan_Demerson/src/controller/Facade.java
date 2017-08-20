/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Luan
 */
public class Facade {
    private Controller controller;
    
    
    
    public String[] abrirArquivo(File file) {
        String[] rotas;
        rotas = controller.importarArquivo(file);
        return rotas;
    }
    
}
