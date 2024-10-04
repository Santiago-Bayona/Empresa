package co.edu.uniquindio.poo.Empresa;

import java.util.Collection;
import java.util.LinkedList;


public class Empresa {

    private String Nombre;
    Collection<EmpleadoTiempoCompleto> empleadoTiempoCompletos;
    Collection<EmpleadoPorHora> empleadoPorHoras;
    Collection<EmpleadoFreelance> empleadoFreelances;
    
    /**
     * Metodo constructor de la clase Empresa
     * @param nombre
     * @param empleadoTiempoCompletos
     * @param empleadoPorHoras
     * @param empleadoFreelances
     */
    public Empresa(String nombre) {
        Nombre = nombre;
        this.empleadoTiempoCompletos = new LinkedList<>();
        this.empleadoPorHoras = new LinkedList<>();
        this.empleadoFreelances = new LinkedList<>();
    }

    /**
     * Metodo que permite obtener el nombre de la empresa
     * @return nombre de la empresa
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Metodo que permite modificar el nombre de la empresa
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    /**
     * Metodo que permite obtener la coleccion de empleados de tiempo completo de la empresa
     * @return Collecaion de empleados de tiempo completo
     */
    public Collection<EmpleadoTiempoCompleto> getEmpleadoTiempoCompletos() {
        return empleadoTiempoCompletos;
    }

    /**
     * Metodo que permite modificar la coleccion de empleados de tiempo completo de la empresa
     * @param empleadoTiempoCompletos
     */
    public void setEmpleadoTiempoCompletos(Collection<EmpleadoTiempoCompleto> empleadoTiempoCompletos) {
        this.empleadoTiempoCompletos = empleadoTiempoCompletos;
    }

    /**
     * Metodo que permite obtener la coleccion de empleados por horas de la empresa
     * @return Coleccion de empleqado por horas
     */
    public Collection<EmpleadoPorHora> getEmpleadoPorHoras() {
        return empleadoPorHoras;
    }

    /**
     * Metodo que permite modificar la coleccion de empleados por horas de la empresa
     * @param empleadoPorHoras
     */
    public void setEmpleadoPorHoras(Collection<EmpleadoPorHora> empleadoPorHoras) {
        this.empleadoPorHoras = empleadoPorHoras;
    }

    /**
     * Metodo que permite obtener la coleccion de empleados Freelance de la empresa
     * @return Coleccion de empleados Freelance
     */
    public Collection<EmpleadoFreelance> getEmpleadoFreelances() {
        return empleadoFreelances;
    }

    /**
     * Metodo que permite modificar la coleccion de empleados Freelance de la empresa
     * @param empleadoFreelances
     */
    public void setEmpleadoFreelances(Collection<EmpleadoFreelance> empleadoFreelances) {
        this.empleadoFreelances = empleadoFreelances;
    }

    /**
     * Metodo que permite verificar que no se agreguen 2 empleados de tiempo completo iguales
     * @param id
     * @return
     */
    public boolean verificarEmpleadoTiempoCompleto(String id) {
        for (EmpleadoTiempoCompleto empleadoTiempoCompleto : empleadoTiempoCompletos) {
            if (id.equals(empleadoTiempoCompleto.getId())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite verificar que no se agreguen 2 empleados por horas iguales
     * @param id
     * @return
     */
    public boolean verificarEmpleadoPorHoras(String id) {
        for (EmpleadoPorHora empleadoPorHora : empleadoPorHoras) {
            if (id.equals(empleadoPorHora.getId())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite verificar que no se agreguen 2 empleados Freelance iguales
     * @param id
     * @return
     */
    public boolean verificarEmpleadoFreelance(String id) {
        for (EmpleadoFreelance empleadoFreelance : empleadoFreelances) {
            if (id.equals(empleadoFreelance.getId())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite agrgar empleados de tiempo completo 
     * @param empleadoTiempoCompleto
     */
    public void agregarEmpleadoTiempoCompleto(EmpleadoTiempoCompleto empleadoTiempoCompleto){
        if(verificarEmpleadoTiempoCompleto(empleadoTiempoCompleto.getId())){
            empleadoTiempoCompletos.add(empleadoTiempoCompleto);
        }
    }

    /**
     * Metodo que permite agrgar empleados por horas
     * @param empleadoPorHora
     */
    public void agregarEmpleadoPorhora(EmpleadoPorHora empleadoPorHora){
        if(verificarEmpleadoPorHoras(empleadoPorHora.getId())){
            empleadoPorHoras.add(empleadoPorHora);
        }
    }

    /**
     * Metodo que permite agrgar empleados Freelance
     * @param empleadoFreelance
     */
    public void agregarEmpleadoFreelance(EmpleadoFreelance empleadoFreelance){
        if(verificarEmpleadoFreelance(empleadoFreelance.getId())){
            empleadoFreelances.add(empleadoFreelance);
        }
    }

    @Override
    public String toString() {
        return "Empresa [Nombre=" + Nombre + ", empleadoTiempoCompletos=" + empleadoTiempoCompletos
                + ", empleadoPorHoras=" + empleadoPorHoras + ", empleadoFreelances=" + empleadoFreelances + "]";
    }
}
