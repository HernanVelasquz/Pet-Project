package co.com.sofka.logicaempleado;

import co.com.sofka.domain.generic.EventChange;

public class EmpleadoEventChange extends EventChange {
    public EmpleadoEventChange(Empleado empleado) {
        apply((EmpleadoCreado event) ->{
            empleado.documento = new Documento(event.getDocumentoId(),event.getTipoDocumento(),event.getNumeroDocumento());
            empleado.responsable = new Responsable(event.getResponsableId(),event.getNombresCompletos(),event.getTelefono(),event.getCorreo());
        });
    }
}
