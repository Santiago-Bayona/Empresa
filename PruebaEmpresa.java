package co.edu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Empresa.EmpleadoFreelance;
import co.edu.uniquindio.poo.Empresa.EmpleadoPorHora;
import co.edu.uniquindio.poo.Empresa.EmpleadoTiempoCompleto;


public class PruebaEmpresa {

    @Test
    public void testCalcularSalarioPorHoras() {
        EmpleadoPorHora empleado2 = new EmpleadoPorHora("Lucas","10454",10, 100);

        int salarioEsperado = 10 * 100;

        int salarioCalculado = empleado2.CalcularSalario();

        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testEmpleadoFreelance() {
        EmpleadoFreelance empleado3 = new EmpleadoFreelance("Sara", "18857", 120, 8);

        int salarioEsperado = 120 * 8;

        int salarioCalculado = empleado3.CalcularSalario();

        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testEmpleadoTiempoCompleto() {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("jose", "10245", 4500);

        int salarioEsperado = 4500;

        int salarioCalculado = empleado1.CalcularSalario();

        assertEquals(salarioEsperado, salarioCalculado);
    }
}

