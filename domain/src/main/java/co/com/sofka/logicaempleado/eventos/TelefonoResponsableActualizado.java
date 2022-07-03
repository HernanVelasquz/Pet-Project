package co.com.sofka.logicaempleado.eventos;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaempleado.values.Telefono;


public class TelefonoResponsableActualizado extends DomainEvent {
    private final Telefono telefono;

    public TelefonoResponsableActualizado(Telefono telefono) {
        super("sofka.logicaempleado.telefonoresponsableactualizado");
        this.telefono = telefono;
    }


    public Telefono getTelefono(){return telefono;}
}
