package co.com.sofka.logicaempleado.values;

import co.com.sofka.domain.generic.Identity;

public class DocumentoId extends Identity {

    public DocumentoId(String uuid){super(uuid);}

    public DocumentoId(){

    }
    public static DocumentoId of(String id) {return new DocumentoId(id);}
}
