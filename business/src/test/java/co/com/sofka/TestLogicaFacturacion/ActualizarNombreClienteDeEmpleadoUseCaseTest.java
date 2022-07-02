package co.com.sofka.TestLogicaFacturacion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.ActualizarNombreDeEmpleadoUseCase;
import co.com.sofka.logicafacturacion.Empleado;
import co.com.sofka.logicafacturacion.Factura;
import co.com.sofka.logicafacturacion.Registro;
import co.com.sofka.logicafacturacion.commands.ActualizarNombreDeEmpleado;
import co.com.sofka.logicafacturacion.events.FacturacionGenerada;
import co.com.sofka.logicafacturacion.events.NombreDeEmpleadoActualizado;
import co.com.sofka.logicafacturacion.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ActualizarNombreClienteDeEmpleadoUseCaseTest {
    private ActualizarNombreDeEmpleadoUseCase actualizarNombreDeEmpleadoUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup() {
        actualizarNombreDeEmpleadoUseCase = new ActualizarNombreDeEmpleadoUseCase();
        repository = mock(DomainEventRepository.class);
        actualizarNombreDeEmpleadoUseCase.addRepository(repository);
    }

    @Test
    void actualizarNombreDeEmpleadoHappyPath() {
        //arrange
        var command = new ActualizarNombreDeEmpleado(
                ParqueaderoId.of("xxx-xxx"),
                new Nombre("Alvaro Enrique Vega Moreno")
        );

        when(repository.getEventsBy(any())).thenReturn(events());

        //act

        var response = UseCaseHandler.getInstance().
                setIdentifyExecutor("xxx-xxx").syncExecutor(
                        actualizarNombreDeEmpleadoUseCase,
                        new RequestCommand<>(command)
                ).orElseThrow();

        var evento = (NombreDeEmpleadoActualizado) response.getDomainEvents().get(0);

        //assert
        Assertions.assertEquals("Alvaro Enrique Vega Moreno", evento.getNombre().value());
        Assertions.assertEquals("co.sofka.logicafacturacion.nombredeempleadoactualizado", evento.type);
    }

    private List<DomainEvent> events() {
        return List.of(new FacturacionGenerada(
                new Registro(new RegistroId("xxx-xx1"),
                        new Precio("50000"),
                        new TipoMensualidad(2)),
                new Empleado(new EmpleadoId("xxx-xx2"),
                        new FechaNacimiento(new Date(2021, 2, 8)),
                        new Nombre("JAlvaro Enrique Vega Moreno"),
                        new Correo("abc123@gmail.com"),
                        new Telefono("3207317601")),
                new Factura(new FacturaId("xxx-xx3"),
                        new HoraSalida("10"),
                        new ValorTotal("100000"))
        ));
    }
}
