package co.com.sofka.logicaempleado.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaempleado.values.EmpleadoId;
import co.com.sofka.logicaempleado.values.Telefono;

public class ActualizarTelefonoResponsable extends Command {
    private final EmpleadoId empleadoId;
    private final Telefono telefono;

    public ActualizarTelefonoResponsable(EmpleadoId empleadoId, Telefono telefono) {
        this.empleadoId = empleadoId;
        this.telefono = telefono;
    }


    public EmpleadoId getEmpleadoId(){return empleadoId;}
    public Telefono getTelefono(){return telefono;}
}
