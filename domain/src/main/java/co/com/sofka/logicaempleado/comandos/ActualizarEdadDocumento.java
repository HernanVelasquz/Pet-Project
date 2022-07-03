package co.com.sofka.logicaempleado.comandos;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaempleado.values.NumeroDocumento;
import co.com.sofka.logicaempleado.values.EmpleadoId;

public class ActualizarEdadDocumento extends Command {
    private final EmpleadoId empleadoId;
    private final NumeroDocumento edad;

    public ActualizarEdadDocumento(EmpleadoId empleadoId, NumeroDocumento edad) {
        this.empleadoId = empleadoId;
        this.edad = edad;
    }


    public EmpleadoId getEmpleadoId(){return empleadoId;}
    public NumeroDocumento getEdad(){return edad;}
}
