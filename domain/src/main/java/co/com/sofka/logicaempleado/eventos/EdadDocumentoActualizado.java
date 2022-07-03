package co.com.sofka.logicaempleado.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaempleado.values.NumeroDocumento;

public class EdadDocumentoActualizado extends DomainEvent {

    private final NumeroDocumento edad;

    public EdadDocumentoActualizado(NumeroDocumento edad) {
        super("sofka.logicaempleado.edaddocumentoactualizado");
        this.edad = edad;
    }

    public NumeroDocumento getEdad(){return edad;}

}
