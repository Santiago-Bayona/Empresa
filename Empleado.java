package co.edu.uniquindio.poo.Empresa;

public abstract class  Empleado {
    private String Nombre;
    private String Id;
    
    /**
     * Metodo constructor de la clase Empleado
     * @param nombre
     * @param id
     */
    public Empleado(String nombre, String id) {
        this.Nombre = nombre;
        this.Id = id;
    }

    /**
     * Metodo para obtener el nombre del empleado
     * @return nombre del empleado
     */
    public String getNombre() {
        return Nombre;
    }


    /**
     * Metodo que permite modfificar el nombre del empleado
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    /**
     * Metodo que permite obtener la identificacion del empleado
     * @return Id del empleado
     */
    public String getId() {
        return Id;
    }

    /**
     * Metodo que permite modificar la identificacion del empleado
     * @param id
     */
    public void setId(String id) {
        this.Id = id;
    }

    /**
     * Metodo que permite calcular el salario según el tipo de empleado
     */
    public abstract int CalcularSalario();


    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Id=" + Id ;
    }

}
