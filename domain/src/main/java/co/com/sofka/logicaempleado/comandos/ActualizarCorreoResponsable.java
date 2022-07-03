package co.com.sofka.logicaempleado.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaempleado.values.Correo;
import co.com.sofka.logicaempleado.values.EmpleadoId;

public class ActualizarCorreoResponsable extends Command {

    private final EmpleadoId empleadoId;
    private final Correo correo;


    public ActualizarCorreoResponsable(EmpleadoId empleadoId, Correo correo) {
        this.empleadoId = empleadoId;
        this.correo = correo;
    }
    public EmpleadoId getEmpleadoId(){return empleadoId;}
    public Correo getCorreo(){return correo;}
}
