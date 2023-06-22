/*
 * Oscar David Cuaical Lopez
 * Grupo: 01
 * Profesor: Luis Yovany Romo Portilla
 * Fecha: 22/06/2023
 * Parcial final 
 */

package Archivos;

import DAO.DatosPacienteDAO;
import Model.Alergias;
import Model.Paciente;

import java.io.*;
import java.util.List;

public class ArchivoManager {
    private static final String RUTA_PACIENTES = "archivo/pacientes.txt";
    private static final String RUTA_ALERGIAS = "archivo/alergias.txt";

    public static void guardarPacientes(List<Paciente> pacientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_PACIENTES))) {
            for (Paciente paciente : pacientes) {
                writer.write(paciente.getIdentificacion() + "," +
                        paciente.getApellidos() + "," +
                        paciente.getNombre() + "," +
                        paciente.getDireccion() + "," +
                        paciente.getTelefono());

                List<String> alergias = paciente.getAlergias();
                for (String alergia : alergias) {
                    writer.write("," + alergia);
                }

                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Paciente> cargarPacientes() {
        DatosPacienteDAO dao = new DatosPacienteDAO();

        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_PACIENTES))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int identificacion = Integer.parseInt(data[0]);
                String apellidos = data[1];
                String nombre = data[2];
                String direccion = data[3];
                int telefono = Integer.parseInt(data[4]);

                Paciente paciente = new Paciente(identificacion, apellidos, nombre, direccion, telefono, null);

                for (int i = 5; i < data.length; i++) {
                    paciente.agregarAlergia(data[i]);
                }

                dao.agregarPaciente(paciente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

        
    }

    public static void guardarAlergias(List<Alergias> alergias) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ALERGIAS))) {
            for (Alergias alergia : alergias) {
                writer.write(alergia.getNombre());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Alergias> cargarAlergias() {
        DatosPacienteDAO dao = new DatosPacienteDAO();

        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ALERGIAS))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Alergias alergia = new Alergias(line);
                dao.agregarAlergia(alergia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dao.obtenerAlergias();
    }
}
