package co.com.sofka.loqicaparqueadero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.logicaparqueadero.Estacionamiento;
import co.com.sofka.logicaparqueadero.commands.AgregarVehiculo;

public class AgregarVehiculoUseCase extends UseCase<RequestCommand<AgregarVehiculo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarVehiculo> agregarComentarioRequestCommand) {
        var command = agregarComentarioRequestCommand.getCommand();
        var estacionamiento = Estacionamiento.from(command.getEstacionamientoId(),retrieveEvents(command.getEstacionamientoId().value()));
        estacionamiento.agregarVehiculo(command.getVehiculoId(), command.getNombreCliente(), command.getTipoVehiculo());
        emit().onResponse(new ResponseEvents(estacionamiento.getUncommittedChanges()));
    }
}
