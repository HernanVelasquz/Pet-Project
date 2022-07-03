package co.com.sofka.logicaempleado.values;

import co.com.sofka.domain.generic.Identity;

public class ResponsableId extends Identity {

    public ResponsableId(String uuid){super(uuid);}

    public ResponsableId(){

    }
    public static ResponsableId of(String id) {return new ResponsableId(id);}
}
