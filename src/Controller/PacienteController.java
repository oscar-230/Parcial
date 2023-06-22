/*
 * Oscar David Cuaical Lopez
 * Grupo: 01
 * Profesor: Luis Yovany Romo Portilla
 * Fecha: 22/06/2023
 */

package Controller;

import Model.Alergias;
import Model.DatosPaciente;
import Model.Paciente;
import java.util.List;


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
