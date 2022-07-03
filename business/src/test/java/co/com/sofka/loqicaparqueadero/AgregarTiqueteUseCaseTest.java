package co.com.sofka.loqicaparqueadero;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.logicaparqueadero.commands.AgregarTiquete;
import co.com.sofka.logicaparqueadero.events.EstacionamientoCreado;
import co.com.sofka.logicaparqueadero.events.TiqueteAgregado;
import co.com.sofka.logicaparqueadero.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarTiqueteUseCaseTest {
    @InjectMocks
    AgregarTiqueteUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    private void setup() {
        useCase = new AgregarTiqueteUseCase();
        repository = mock(DomainEventRepository.class);
        useCase.addRepository(repository);
    }

    @Test
    void aggregarTiqueteHappyCity(){
        var command = new AgregarTiquete(
                EstacionamientoId.of("xx"),
                TiqueteId.of("yyy"),
                new TipoVehiculo(
                        ParqueaderoId.of("2"),
                        "Camioneta"
                ),
                new HoraIngreso(4)
        );

        when(repository.getEventsBy(any())).thenReturn(events());

        var response = UseCaseHandler.getInstance()
                .syncExecutor(
                        useCase,
                        new RequestCommand<>(command)
                ).orElseThrow();
        var event = (TiqueteAgregado) response.getDomainEvents().get(0);

        Assertions.assertEquals(4, event.getHoraIngreso().value());
        Assertions.assertEquals("yyy", event.getTiqueteId().value());
        Assertions.assertEquals("Camioneta", event.getTipoVehiculo().value().nombre());
    }
    private List<DomainEvent> events(){
        return List.of(new EstacionamientoCreado(
                ParqueaderoId.of("xx"),
                ClienteId.of("xxx"),
                new NombreCliente("Hernan Velasquez"),
                new CorreoCliente("hernaVelasq@hotmail.com")
        ));
    }
}