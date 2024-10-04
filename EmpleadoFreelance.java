package co.edu.uniquindio.poo.Empresa;

public class EmpleadoFreelance extends Empleado{

    private int PagoPorProyecto;
    private int ProyectosCompletos;
    
    /**
     * Metodo constructor de la clase EmpleadoFreelance
     * @param nombre
     * @param id
     * @param pagoPorProyecto
     * @param proyectosCompletos
     */
    public EmpleadoFreelance(String nombre, String id, int pagoPorProyecto, int proyectosCompletos) {
        super(nombre, id);
        this.PagoPorProyecto = pagoPorProyecto;
        this.ProyectosCompletos = proyectosCompletos;
    }

    /**
     * Metodo que permite obtener el pago por proyecto del empleado Freelance
     * @return Pago por proyecto
     */
    public int getPagoPorProyecto() {
        return PagoPorProyecto;
    }

    /**
     * Metodo que permite modificar el pago por proyecto del empleado Freelance
     * @param pagoPorProyecto
     */
    public void setPagoPorProyecto(int pagoPorProyecto) {
        this.PagoPorProyecto = pagoPorProyecto;
    }

    /**
     * Metodo que permite obtener el numero de proyectos completos del empleado Freelance
     * @return numero de proyectos completos
     */
    public int getProyectosCompletos() {
        return ProyectosCompletos;
    }

    /**
     * Metodo que permite obtener el numero de proyectos completos del empleado Freelance
     * @param proyectosCompletos
     */
    public void setProyectosCompletos(int proyectosCompletos) {
        this.ProyectosCompletos = proyectosCompletos;
    }

    /**
     * Metodo que permite calcular el salario de un empleado Freelance
     */
    public void CalcularSalario(){
        int Salario = PagoPorProyecto*ProyectosCompletos;
        System.out.println("El Salario del empleado Freelance es: " + Salario);
    }

    @Override
    public String toString() {
        return "EmpleadoFreelance" + super.toString() + "[PagoPorProyecto=" + PagoPorProyecto + ", ProyectosCompletos=" + ProyectosCompletos
                + "]";
    }
}
