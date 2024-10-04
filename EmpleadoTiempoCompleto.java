package co.edu.uniquindio.poo.Empresa;

public class EmpleadoTiempoCompleto extends Empleado{

    private int SalarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String id, int salarioMensual) {
        super(nombre, id);
        this.SalarioMensual = salarioMensual;
    }

    /**
     * Metodo que permite obtener el salario mensual del empleado de tiempo completo
     * @return Salario mensual
     */
    public int getSalarioMensual() {
        return SalarioMensual;
    }

    /**
     * Metodo que permite modificar el salario mensual del empleado de tiempo completo
     * @param salarioMensual
     */
    public void setSalarioMensual(int salarioMensual) {
        this.SalarioMensual = salarioMensual;
    }

    /**
     * Metodo que permite Calcular el salario mensual del empleado de tiempo completo
     */
    public void CalcularSalario(){
        System.out.println("El salrio del empleado de tiempo completo es: " + SalarioMensual);
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto" + super.toString() + "[SalarioMensual=" + SalarioMensual + "]";
    }

    
}
