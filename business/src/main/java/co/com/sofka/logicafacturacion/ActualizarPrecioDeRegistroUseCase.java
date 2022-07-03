package co.com.sofka.logicafacturacion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.logicafacturacion.commands.ActualizarPrecioDeRegistro;

public class ActualizarPrecioDeRegistroUseCase  extends UseCase<RequestCommand<ActualizarPrecioDeRegistro>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarPrecioDeRegistro> actualizarPrecioDeRegistroRequestCommand) {
        var command = actualizarPrecioDeRegistroRequestCommand.getCommand();
        var facturacion = Facturacion.from(command.ObtenerParqueaderoId(), retrieveEvents(command.ObtenerParqueaderoId().value()));

        facturacion.modificarPrecioDeRegistro(command.ObtenerPrecio());
        emit().onResponse(new ResponseEvents(facturacion.getUncommittedChanges()));
    }
}
