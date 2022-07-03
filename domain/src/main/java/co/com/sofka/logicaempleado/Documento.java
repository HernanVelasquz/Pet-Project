package co.com.sofka.logicaempleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicaempleado.values.DocumentoId;
import co.com.sofka.logicaempleado.values.NumeroDocumento;
import co.com.sofka.logicaempleado.values.TipoDocumento;

public class Documento extends Entity<DocumentoId> {
        private final TipoDocumento tipoDocumento;
        private final NumeroDocumento numeroDocumento;


    public Documento(DocumentoId entityId, TipoDocumento tipoDocumento, NumeroDocumento numeroDocumento) {
        super(entityId);
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
}
