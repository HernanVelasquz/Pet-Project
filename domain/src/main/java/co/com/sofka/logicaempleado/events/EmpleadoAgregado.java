package co.com.sofka.logicaempleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaempleado.values.*;

public class EmpleadoAgregado extends DomainEvent {

    private final ResponsableId responsableId;
    private final EmpleadoId empleadoId;
    private final NombresCompletos nombresCompletos;
    private final Correo correo;
    private final DocumentoId documentoId;

    public EmpleadoAgregado(ResponsableId responsableId, EmpleadoId empleadoId, NombresCompletos nombresCompletos, Correo correo, DocumentoId documentoId) {
        super("sofka.logicaempleado.empleadoagregado");
        this.responsableId = responsableId;
        this.empleadoId = empleadoId;
        this.nombresCompletos = nombresCompletos;
        this.correo = correo;
        this.documentoId = documentoId;
    }

    public ResponsableId getResponsableId(){return responsableId;}
    public EmpleadoId getEmpleadoId(){return empleadoId;}
    public NombresCompletos getNombresCompletos(){return nombresCompletos;}
    public Correo getCorreo(){return correo;}
    public DocumentoId getDocumentoId(){return documentoId;}
}
