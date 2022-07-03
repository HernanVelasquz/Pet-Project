package co.com.sofka.logicaparqueadero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaparqueadero.values.CorreoCliente;

public class CorreoDeClienteCambiado extends DomainEvent {
    private final CorreoCliente correoCliente;

    public CorreoDeClienteCambiado( CorreoCliente correoCliente) {
        super("sofka.parqueadero.correodeclientecambiado");
        this.correoCliente = correoCliente;
    }

    public CorreoCliente getCorreoCliente() {
        return correoCliente;
    }
}
