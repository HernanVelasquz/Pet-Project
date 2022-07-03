package co.com.sofka.logicaempleado;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicaempleado.values.*;

public class Responsable extends Entity<ResponsableId> {

    protected NombresCompletos nombresCompletos;
    protected Telefono telefono;
    protected Correo correo;

    public Responsable(ResponsableId entityId, NombresCompletos nombresCompletos, Telefono telefono, Correo correo) {
        super(entityId);
        this.nombresCompletos = nombresCompletos;
        this.telefono = telefono;
        this.correo = correo;
    }


}
