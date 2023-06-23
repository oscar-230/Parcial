/*
 * Oscar David Cuaical Lopez
 * Grupo: 01
 * Profesor: Luis Yovany Romo Portilla
 * Fecha: 22/06/2023
 * Parcial final
 */
package Model;

import java.util.ArrayList;
import java.util.List;


public class Paciente {
    private int identificacion;
    private String apellidos;
    private String nombre;
    private String direccion;
    private int telefono;
    private List<String> alergias;

    public Paciente(int identificacion, String apellidos, String nombre, String direccion, int telefono, List<String> alergias) {
        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.alergias = new ArrayList<>();
        if (alergias != null) {
            this.alergias.addAll(alergias);
        }
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }
 
    public void agregarAlergia(String alergia) {
        alergias.add(alergia);
    }
    
    
}
