package co.com.sofka.logicaempleado.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaempleado.values.EmpleadoId;
import co.com.sofka.logicaempleado.values.ResponsableId;

public class AsignarResponsable extends Command {
    private final EmpleadoId empleadoId;
    private final ResponsableId responsableId;

    public AsignarResponsable(EmpleadoId empleadoId, ResponsableId responsableId) {
        this.empleadoId = empleadoId;
        this.responsableId = responsableId;
    }


    public EmpleadoId getEmpleadoId(){return empleadoId;}
    public ResponsableId getResponsableId(){return responsableId;}
}
