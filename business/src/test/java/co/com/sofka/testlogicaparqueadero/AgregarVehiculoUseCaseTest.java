package co.com.sofka.testlogicaparqueadero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import co.com.sofka.logicaparqueadero.commands.AgregarVehiculo;
import co.com.sofka.logicaparqueadero.events.EstacionamientoCreado;
import co.com.sofka.logicaparqueadero.events.VehiculoAgregado;
import co.com.sofka.logicaparqueadero.values.*;
import co.com.sofka.loqicaparqueadero.AgregarVehiculoUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AgregarVehiculoUseCaseTest {
    private AgregarVehiculoUseCase agregarVehiculoUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    private void setup() {
        agregarVehiculoUseCase = new AgregarVehiculoUseCase();
        repository = mock(DomainEventRepository.class);
        agregarVehiculoUseCase.addRepository(repository);
    }

    @Test
    void agregarVehiculoHappyPath() {
        var command = new AgregarVehiculo(
                EstacionamientoId.of("xxx"),
                VehiculoId.of("xx-xx"),
                new NombreCliente("Jesus Lara"),
                new TipoVehiculo(
                        ParqueaderoId.of("1"),
                        "Motocicleta"
                ));
        when(repository.getEventsBy(any())).thenReturn(events());

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("xxx-xxx")
                .syncExecutor(
                        agregarVehiculoUseCase,
                        new RequestCommand<>(command)
                ).orElseThrow();
        var evento = (VehiculoAgregado) response.getDomainEvents().get(0);

        Assertions.assertEquals("Jesus Lara", evento.getNombreCliente().value());
        Assertions.assertEquals("xx-xx", evento.getVehiculoId().value());
        Assertions.assertEquals("1", evento.getTipoVehiculo().value().parqueaderoId().value());
        Assertions.assertEquals("Motocicleta", evento.getTipoVehiculo().value().nombre());

    }

    private List<DomainEvent> events() {
        return List.of(new EstacionamientoCreado(
                ParqueaderoId.of("1"),
                ClienteId.of("2"),
                new NombreCliente("Martin perez"),
                new CorreoCliente("martinperez@hotmail.com")
        ));
    }
}