package co.com.sofka.loqicaparqueadero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.logicaparqueadero.Estacionamiento;
import co.com.sofka.logicaparqueadero.commands.AgregarTiquete;


public class AgregarTiqueteUseCase extends UseCase<RequestCommand<AgregarTiquete>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarTiquete> agregarTiqueteRequestCommand) {
        var command = agregarTiqueteRequestCommand.getCommand();
        var estacionamiento = Estacionamiento.from(
                command.getEstacionamientoId(),
                retrieveEvents(command.getEstacionamientoId().value())
        );
        estacionamiento.agregarTiquete(
                command.getTiqueteId(),
                command.getTipoVehiculo(),
                command.getHoraIngreso()
        );
        emit().onResponse(new ResponseEvents(estacionamiento.getUncommittedChanges()));
    }
}
