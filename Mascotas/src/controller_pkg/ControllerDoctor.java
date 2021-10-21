/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model_pkg.DataDB;
import model_pkg.DataModelDB;
import vews_pkg.DialogDoctores;

/**
 *
 * @author asus
 */
public class ControllerDoctor implements ActionListener{

    private final DialogDoctores view;
    
    public ControllerDoctor(DialogDoctores view) {
        this.view = view;
        getClinicas();
        ItemHospital item = (ItemHospital) view.cbClinicas.getSelectedItem();
        events();
    }

    public final void events() {
        view.cbClinicas.addActionListener(this);
    }
    
    public final void getClinicas() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getHospitals(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idHospital = list.get(i).getIdHospital();
                String hospital = list.get(i).getHospital();
                view.cbClinicas.addItem(new ItemHospital(idHospital, hospital));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clinicas", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }


    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
