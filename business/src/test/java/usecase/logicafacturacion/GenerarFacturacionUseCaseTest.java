package usecase.logicafacturacion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.logicafacturacion.Empleado;
import co.com.sofka.logicafacturacion.Factura;
import co.com.sofka.logicafacturacion.Registro;
import co.com.sofka.logicafacturacion.commands.GenerarFacturacion;
import co.com.sofka.logicafacturacion.events.FacturacionGenerada;
import co.com.sofka.logicafacturacion.usecase.GenerarFacturacionUseCase;
import co.com.sofka.logicafacturacion.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class GenerarFacturacionUseCaseTest {

    private GenerarFacturacionUseCase generarFacturacionUseCase;

    @BeforeEach
    public void setup() {
        generarFacturacionUseCase = new GenerarFacturacionUseCase();
    }

    @Test
    void generarFacturacionoHappyPath() {
        //arrange
        var command = new GenerarFacturacion(
                ParqueaderoId.of("xxx-xxx"),
                new Registro(new RegistroId("xxx-xx1"),
                        new Precio("50000"),
                        new TipoMensualidad(1)),
                new Empleado(new EmpleadoId("xxx-xx2"),
                        new FechaNacimiento(new Date(2020, 2, 10)),
                        new Nombre("Piter Velasquez"),
                        new Correo("pvelasquez@gmail.com"),
                        new Telefono("3007777777")),
                new Factura(new FacturaId("xxx-xx3"),
                        new HoraSalida("10"),
                        new ValorTotal("100000"))
        );

        //act
        var response = UseCaseHandler.getInstance().
                syncExecutor(generarFacturacionUseCase, new RequestCommand<>(command)).orElseThrow();

        var events = response.getDomainEvents();

        //asserts
        FacturacionGenerada facturacionGenerada = (FacturacionGenerada) events.get(0);

        Assertions.assertEquals("Piter Velasquez", facturacionGenerada.getEmpleado().nombre().value());
        Assertions.assertEquals("pvelasquez@gmail.com", facturacionGenerada.getEmpleado().correo().value());
        Assertions.assertEquals("10", facturacionGenerada.getFactura().horaSalida().value());
        Assertions.assertEquals("100000", facturacionGenerada.getFactura().valorTotal().value());
        Assertions.assertEquals(1, facturacionGenerada.getRegistro().tipoMensualidad().value());
    }

}