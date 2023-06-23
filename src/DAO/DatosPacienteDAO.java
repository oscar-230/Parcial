/*
 * Oscar David Cuaical Lopez
 * Grupo: 01
 * Profesor: Luis Yovany Romo Portilla
 * Fecha: 22/06/2023
 * Parcial final
 */

package DAO;

import Model.Alergias;
import Model.Paciente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DatosPacienteDAO {
    private Map<Integer, Paciente> pacientes;
    private List<Alergias> alergias;

    public DatosPacienteDAO() {
        pacientes = new HashMap<>();
        alergias = new ArrayList<>();
    
    // Agregar pacientes de ejemplo
        Paciente paciente1 = new Paciente(1234, "Cuaical", "Oscar", "Melendez", 98765432,null);
        agregarPaciente(paciente1);

        Paciente paciente2 = new Paciente(5678, "Lopez", "David", "Cali", 98765433,null);
        agregarPaciente(paciente2);
        
        Paciente paciente3 = new Paciente(10008, "Acosta", "Diego Camilo", "Ciudad Jardon", 31581425, null);
        agregarPaciente(paciente3);
        
        // Agregar alergias base
        Alergias alergia1 = new Alergias("Moho");
        agregarAlergia(alergia1);

        Alergias alergia2 = new Alergias("Alimentos");
        agregarAlergia(alergia2);

        Alergias alergia3 = new Alergias("Insectos");
        agregarAlergia(alergia3);

        Alergias alergia4 = new Alergias("Animales");
        agregarAlergia(alergia4);

        Alergias alergia5 = new Alergias("Lluvia");
        agregarAlergia(alergia5);
        
        Alergias alergia6 = new Alergias("Polen");
        agregarAlergia(alergia6);
        
        Alergias alergia7 = new Alergias("Lactosa");
        agregarAlergia(alergia7);
        
    }
    public List<Alergias> obtenerTodasLasAlergias() {
    return alergias;
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

    public List<Alergias> obtenerAlergias() {
        return alergias;
    }

    public void agregarAlergia(Alergias alergia) {
        alergias.add(alergia);
    }
   
}
