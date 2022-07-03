package co.com.sofka.logicaempleado.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaempleado.values.DocumentoId;
import co.com.sofka.logicaempleado.values.NumeroDocumento;
import co.com.sofka.logicaempleado.values.NombresCompletos;

public class AgregarDocumento extends Command {

    private final DocumentoId documentoId;
    private final NombresCompletos nombresCompletos;
    private final NumeroDocumento edad;

    public AgregarDocumento(DocumentoId documentoId, NombresCompletos nombresCompletos, NumeroDocumento edad) {
        this.documentoId = documentoId;
        this.nombresCompletos = nombresCompletos;
        this.edad = edad;
    }

    public DocumentoId getDocumentoId(){return documentoId;}
    public NombresCompletos getNombresCompletos(){return nombresCompletos;}
    public NumeroDocumento getEdad(){return edad;}
}
