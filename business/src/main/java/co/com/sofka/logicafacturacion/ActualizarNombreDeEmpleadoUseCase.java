package co.com.sofka.logicafacturacion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.logicafacturacion.commands.ActualizarNombreDeEmpleado;

public class ActualizarNombreDeEmpleadoUseCase extends UseCase<RequestCommand<ActualizarNombreDeEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreDeEmpleado> actualizarNombreDeEmpleadoRequestCommand) {
        var command = actualizarNombreDeEmpleadoRequestCommand.getCommand();
        var facturacion = Facturacion.from(command.ObtenerParqueaderoId(), retrieveEvents(command.ObtenerParqueaderoId().value()));

        facturacion.modificarNombreDePersona(command.ObtnerNombre());
        emit().onResponse(new ResponseEvents(facturacion.getUncommittedChanges()));
    }
}
