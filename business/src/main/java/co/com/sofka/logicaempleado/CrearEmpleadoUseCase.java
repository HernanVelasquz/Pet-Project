package co.com.sofka.logicaempleado;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.logicaempleado.commands.AgregarEmpleado;

public class CrearEmpleadoUseCase extends UseCase<RequestCommand<AgregarEmpleado>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarEmpleado> agregarEmpleadoRequestCommand) {
        var command = agregarEmpleadoRequestCommand.getCommand();
        var empleado = new Empleado(
            command.getEmpleadoId(),
                command.getResponsableId(),
                command.getNombresCompletos(),
                command.getTelefono(),
                command.getCorreo(),
                command.getDocumentoId(),
                command.getTipoDocumento(),
                command.getNumeroDocumento()

        );
        emit().onResponse(new ResponseEvents(empleado.getUncommittedChanges()));
    }
}
