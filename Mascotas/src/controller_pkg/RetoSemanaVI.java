/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;

import model_pkg.Conexion;
import vews_pkg.FrameVeterinaria;

/**
 *
 * @author asus
 */
public class RetoSemanaVI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion connect = new Conexion();
        FrameVeterinaria frame = new FrameVeterinaria();
       
       	connect.getConnection();
        frame.setVisible(true);
    }
    
}
