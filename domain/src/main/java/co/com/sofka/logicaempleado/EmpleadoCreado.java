package co.com.sofka.logicaempleado;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaempleado.values.*;

public class EmpleadoCreado extends DomainEvent {
    private final ResponsableId responsableId;
    private final NombresCompletos nombresCompletos;
    private final Telefono telefono;
    private final Correo correo;
    private final DocumentoId documentoId;
    private final TipoDocumento tipoDocumento;
    private final NumeroDocumento numeroDocumento;

    public EmpleadoCreado(ResponsableId responsableId, NombresCompletos nombresCompletos, Telefono telefono, Correo correo, DocumentoId documentoId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento) {
        super("co,com.sofka.logicaempleado.empleadoCreado");
        this.responsableId = responsableId;
        this.nombresCompletos = nombresCompletos;
        this.telefono = telefono;
        this.correo = correo;
        this.documentoId = documentoId;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public ResponsableId getResponsableId() {
        return responsableId;
    }

    public NombresCompletos getNombresCompletos() {
        return nombresCompletos;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Correo getCorreo() {
        return correo;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public NumeroDocumento getNumeroDocumento() {
        return numeroDocumento;
    }
}
