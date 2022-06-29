package co.com.sofka.logicafacturacion.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.logicafacturacion.Facturacion;
import co.com.sofka.logicafacturacion.commands.GenerarFacturacion;

public class GenerarFacturacionUseCase extends UseCase<RequestCommand<GenerarFacturacion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<GenerarFacturacion> generarFacturacionRequestCommand) {
        var commnad = generarFacturacionRequestCommand.getCommand();
        var facturacion = new Facturacion(commnad.getParqueaderoId(), commnad.getrRegistro(), commnad.getEmpleado(), commnad.getFactura());
        emit().onResponse(new ResponseEvents(facturacion.getUncommittedChanges()));
    }
}