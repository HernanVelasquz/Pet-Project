package co.com.sofka.logicaempleado.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaempleado.values.Correo;

public class CorreoResponsableActualizado extends DomainEvent {

    private final Correo correo;

    public CorreoResponsableActualizado(Correo correo) {
        super("sofka.logicaempleado.correoresponsableactualizado");
        this.correo = correo;
    }

    public Correo getCorreo(){return correo;}
}
