package co.com.sofka.logicaempleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaempleado.values.DocumentoId;
import co.com.sofka.logicaempleado.values.NumeroDocumento;
import co.com.sofka.logicaempleado.values.NombresCompletos;

public class DocumentoAgregado extends DomainEvent {
    private final DocumentoId documentoId;
    private final NombresCompletos nombresCompletos;
    private final NumeroDocumento edad;


    public DocumentoAgregado(DocumentoId documentoId, NombresCompletos nombresCompletos, NumeroDocumento edad) {
        super("sofka.logicaempleado.documentoagregado");
        this.documentoId = documentoId;
        this.nombresCompletos = nombresCompletos;
        this.edad = edad;
    }

    public DocumentoId getDocumentoId(){return documentoId;}
    public NombresCompletos getNombresCompletos(){return nombresCompletos;}
    public NumeroDocumento getEdad(){return edad;}
}
