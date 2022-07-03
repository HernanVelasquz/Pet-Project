package co.com.sofka.logicaparqueadero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaparqueadero.values.NombreCliente;
import co.com.sofka.logicaparqueadero.values.VehiculoId;

import java.util.UUID;

public class NombrePropietarioDeVehiculoCambiado extends DomainEvent {
    private final VehiculoId vehiculoId;
    private final NombreCliente nombreCliente;

    public NombrePropietarioDeVehiculoCambiado(VehiculoId vehiculoId, NombreCliente nombreCliente) {
        super("sofka.parqueadero.nombrepropietariodevehiculocambiado");
        this.vehiculoId = vehiculoId;
        this.nombreCliente = nombreCliente;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }
}
