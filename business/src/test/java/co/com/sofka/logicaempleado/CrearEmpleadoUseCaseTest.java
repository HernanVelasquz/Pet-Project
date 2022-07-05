package co.com.sofka.logicaempleado;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;


import co.com.sofka.logicaempleado.commands.AgregarEmpleado;
import co.com.sofka.logicaempleado.values.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)

class CrearEmpleadoUseCaseTest {
    @InjectMocks
    CrearEmpleadoUseCase useCase;

    @Test
    public void crearVenta() {
        //arrange
        ResponsableId responsableId = ResponsableId.of("1");
        EmpleadoId empleadoId = EmpleadoId.of("1");
        NombresCompletos nombresCompletos = new NombresCompletos("stevent");
        Correo correo = new Correo("stevent@gmail.com");
        Telefono telefono = new Telefono("320145");
        DocumentoId documentoId = DocumentoId.of("1");
        TipoDocumento tipoDocumento = new TipoDocumento("pasaporte");
        NumeroDocumento numeroDocumento = new NumeroDocumento(10);

        var command = new AgregarEmpleado(responsableId, empleadoId, nombresCompletos, correo, telefono, documentoId, tipoDocumento, numeroDocumento);


        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert
        var event = (EmpleadoCreado) events.get(0);
        //     Assertions.assertEquals("wisquie",event.getNombreBebida());
//        Assertions.assertEquals("Usuario", event.rol().value());

    }
}