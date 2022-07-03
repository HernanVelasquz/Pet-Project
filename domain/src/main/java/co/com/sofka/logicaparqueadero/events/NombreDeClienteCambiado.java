package co.com.sofka.logicaparqueadero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaparqueadero.values.NombreCliente;

public class NombreDeClienteCambiado extends DomainEvent {
    private final NombreCliente nombreCliente;

    public NombreDeClienteCambiado(NombreCliente nombreCliente) {
        super("sofka.parqueadero.nombredeclientecambiado");
        this.nombreCliente = nombreCliente;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }
}
