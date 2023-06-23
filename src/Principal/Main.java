/*
 * Oscar David Cuaical Lopez
 * Grupo: 01
 * Profesor: Luis Yovany Romo Portilla
 * Fecha: 22/06/2023
 * Parcial final
 */
package Principal;

import DAO.DatosPacienteDAO;
import View.PacienteView;




public class Main {

    
    public static void main(String[] args) {
        
        PacienteView pacienteView = new PacienteView(new DatosPacienteDAO());

        // Hacer visible la vista
        pacienteView.setVisible(true);

    }
    
}
