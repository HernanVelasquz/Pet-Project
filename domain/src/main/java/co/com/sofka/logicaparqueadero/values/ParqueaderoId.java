package co.com.sofka.logicaparqueadero.values;

import co.com.sofka.domain.generic.Identity;

public class ParqueaderoId extends Identity {
    public ParqueaderoId(String uuid) {
        super(uuid);
    }

    public ParqueaderoId() {}

    public static ParqueaderoId of(String id){
        return new ParqueaderoId(id);
    }
}
