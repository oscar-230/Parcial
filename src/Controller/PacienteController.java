/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Alergias;
import Model.DatosPaciente;
import Model.Paciente;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PacienteController {
    private DatosPaciente model;

    public PacienteController(DatosPaciente model) {
        this.model = model;
    }

    public Paciente buscarPaciente(int identificacion) {
        return model.buscarPaciente(identificacion);
    }

    public void agregarPaciente(Paciente paciente) {
        model.agregarPaciente(paciente);
    }

    public void actualizarPaciente(Paciente paciente) {
        model.actualizarPaciente(paciente);
    }

    public List<Alergias> obtenerAlergias() {
        return model.obtenerAlergias();
    }

    public void agregarAlergia(Alergias alergia) {
        model.agregarAlergia(alergia);
    }
    
}
