/*
 * Oscar David Cuaical Lopez
 * Grupo: 01
 * Profesor: Luis Yovany Romo Portilla
 * Fecha: 22/06/2023
 */

package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DatosPaciente {
    private Map<Integer, Paciente> pacientes;
    private List<Alergias> alergias;

    public DatosPaciente() {
        pacientes = new HashMap<>();
        alergias = new ArrayList<>();
    }

    // Métodos para operaciones CRUD (crear, leer, actualizar, eliminar)

    public Paciente buscarPaciente(int identificacion) {
        return pacientes.get(identificacion);
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.put(paciente.getIdentificacion(), paciente);
    }

    public void actualizarPaciente(Paciente paciente) {
        pacientes.put(paciente.getIdentificacion(), paciente);
    }

    public void eliminarPaciente(int identificacion) {
        pacientes.remove(identificacion);
    }

    public List<Alergias> obtenerAlergias() {
        return alergias;
    }

    public void agregarAlergia(Alergias alergia) {
        alergias.add(alergia);
    }
}
