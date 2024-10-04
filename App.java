package co.edu.uniquindio.poo.Empresa;

public class App {
    public static void main(String[] args) {
        Empresa CodeEmpres = new Empresa("CodeEmpres");

        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("jose", "10245", 4500);

        EmpleadoPorHora empleado2 = new EmpleadoPorHora("Lucas","10454",10, 100);

        EmpleadoFreelance empleado3 = new EmpleadoFreelance("Sara", "18857", 120, 8);

        CodeEmpres.agregarEmpleadoTiempoCompleto(empleado1);
        CodeEmpres.agregarEmpleadoPorhora(empleado2);
        CodeEmpres.agregarEmpleadoFreelance(empleado3);

        empleado1.CalcularSalario();
        empleado2.CalcularSalario();
        empleado3.CalcularSalario();

        System.out.println(CodeEmpres);
    }
}
