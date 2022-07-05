package co.com.sofka.logicaempleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaempleado.values.*;

import java.util.List;

public class Empleado extends AggregateEvent<EmpleadoId> {
    protected Responsable responsable;
    protected Documento documento;



    public Empleado(EmpleadoId entityId, ResponsableId responsableId, NombresCompletos nombresCompletos, Telefono telefono, Correo correo,DocumentoId documentoId,TipoDocumento tipoDocumento,NumeroDocumento numeroDocumento) {
        super(entityId);
        appendChange(new EmpleadoCreado(responsableId,nombresCompletos,telefono,correo,documentoId,tipoDocumento,numeroDocumento)).apply();
        subscribe(new EmpleadoEventChange(this));
    }

    public Empleado(EmpleadoId id){
        super(id);
        subscribe(new EmpleadoEventChange(this));
    }

    public static Empleado from(EmpleadoId id, List<DomainEvent> events){
        var empleado = new Empleado((id));
        events.forEach(empleado::applyEvent);
        return empleado;
    }
}
