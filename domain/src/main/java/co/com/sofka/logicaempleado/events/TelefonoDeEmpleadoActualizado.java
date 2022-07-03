package co.com.sofka.logicafacturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.values.Telefono;

public class TelefonoDeEmpleadoActualizado extends DomainEvent {

    private final Telefono telefono;

    public TelefonoDeEmpleadoActualizado(Telefono telefono) {
        super("sofka.facturacion..telefonodeempleadoactualizado");
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}