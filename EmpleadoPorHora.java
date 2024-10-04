package co.edu.uniquindio.poo.Empresa;

public class EmpleadoPorHora extends Empleado{
    private int HorasTrabajadas;
    private int SalarioPorHora;
    
    /**
     * Metodo condtructor de la clase EmpleadoPorHoras
     * @return nombre del empleado
     */
    public EmpleadoPorHora(String nombre, String id, int horasTrabajadas, int salarioPorHora) {
        super(nombre, id);
        HorasTrabajadas = horasTrabajadas;
        SalarioPorHora = salarioPorHora;
    }

    /**
     * Metodo para obtener las horas trabajadas del empleado
     * @return horas trabajadas del empleado
     */
    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    /**
     * Metodo para modificar las horas trabajadas por el empleado
     * @param horasTrabajadas
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }

    /**
     * Metodo para obtener el salario por hora del empleado
     * @return Salario por hora del empleado
     */
    public int getSalarioPorHora() {
        return SalarioPorHora;
    }

    /**
     * Metodo para modificar el salario por hora del empleado
     */
    public void setSalarioPorHora(int salarioPorHora) {
        SalarioPorHora = salarioPorHora;
    }

    /**
     * Metodo que permite calcular el salrio para un empleado que trabaja por horas
     * @return 
     */
    public int CalcularSalario() {
        int salarioTotal = HorasTrabajadas * SalarioPorHora;
        System.out.println("El salario total es: " + salarioTotal);
        return salarioTotal;
    }

    @Override
    public String toString() {
        return "EmpleadoPorHora" + super.toString() + "[HorasTrabajadas=" + HorasTrabajadas + ", SalarioPorHora=" + SalarioPorHora + "]";
    }    
}
