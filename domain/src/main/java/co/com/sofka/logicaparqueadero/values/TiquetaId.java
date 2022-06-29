package co.com.sofka.logicaparqueadero.values;

import co.com.sofka.domain.generic.Identity;

public class TiquetaId extends Identity {
    public TiquetaId(String uuid) {
        super(uuid);
    }

    public TiquetaId() {}

    public static TiquetaId of(String id){
        return new TiquetaId(id);
    }
}
