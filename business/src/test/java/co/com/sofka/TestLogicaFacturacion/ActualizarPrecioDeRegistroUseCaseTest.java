package co.com.sofka.TestLogicaFacturacion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaempleado.values.Correo;
import co.com.sofka.logicaempleado.values.EmpleadoId;
import co.com.sofka.logicaempleado.values.Telefono;
import co.com.sofka.logicafacturacion.ActualizarPrecioDeRegistroUseCase;
import co.com.sofka.logicafacturacion.Empleado;
import co.com.sofka.logicafacturacion.Factura;
import co.com.sofka.logicafacturacion.Registro;
import co.com.sofka.logicafacturacion.commands.ActualizarPrecioDeRegistro;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import co.com.sofka.logicafacturacion.values.Precio;
import co.com.sofka.logicafacturacion.values.RegistroId;
import  co.com.sofka.logicafacturacion.values.TipoMensualidad;
import co.com.sofka.logicafacturacion.values.FechaNacimiento;
import co.com.sofka.logicafacturacion.events.FacturacionGenerada;
import co.com.sofka.logicafacturacion.values.ValorTotal;
import co.com.sofka.logicafacturacion.values.FacturaId;
import co.com.sofka.logicafacturacion.values.Nombre;
import co.com.sofka.logicafacturacion.values.HoraSalida;
import co.com.sofka.logicafacturacion.events.PrecioDeRegistroActualizado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Date;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ActualizarPrecioDeRegistroUseCaseTest {
    private ActualizarPrecioDeRegistroUseCase actualizarPrecioDeRegistroUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    private void setup() {
        actualizarPrecioDeRegistroUseCase = new ActualizarPrecioDeRegistroUseCase();
        repository = mock(DomainEventRepository.class);
        actualizarPrecioDeRegistroUseCase.addRepository(repository);
    }

    @Test
    void actualizarPrecioDeRegistroHappyPath() {
        //arrange
        var command = new ActualizarPrecioDeRegistro(
                ParqueaderoId.of("xxx-xxx"),
                new Precio("100000")
        );

        when(repository.getEventsBy(any())).thenReturn(events());

        //act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("xxx-xxxx")
                .syncExecutor(
                        actualizarPrecioDeRegistroUseCase,
                        new RequestCommand<>(command)
                ).orElseThrow();
        var evento = (PrecioDeRegistroActualizado) response.getDomainEvents().get(0);
        //assert
        Assertions.assertEquals("100000", evento.getPrecio().value());
    }

    private List<DomainEvent> events() {
        return List.of(new FacturacionGenerada(
                new Registro(new RegistroId("xxx-xx1"),
                        new Precio("50000"),
                        new TipoMensualidad(2)),
                new Empleado(new EmpleadoId("xxx-xx2"),
                        new FechaNacimiento(new Date(2021, 2, 8)),
                        new Nombre("Jesus Lara"),
                        new Correo("abc123@gmail.com"),
                        new Telefono("3207317601")),
                new Factura(new FacturaId("xxx-xx3"),
                        new HoraSalida("10"),
                        new ValorTotal("100000"))
        ));
    }
}
