package co.com.sofka.logicaparqueadero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaparqueadero.values.NombreCliente;
import co.com.sofka.logicaparqueadero.values.TipoVehiculo;
import co.com.sofka.logicaparqueadero.values.VehiculoId;

public class VehiculoAgregado extends DomainEvent {
    private final VehiculoId vehiculoId;
    private final NombreCliente nombreCliente;
    private final TipoVehiculo tipoVehiculo;

    public VehiculoAgregado(VehiculoId vehiculoId, NombreCliente nombreCliente, TipoVehiculo tipoVehiculo) {
        super("sofka.parqueadero.vehiculoagregado");
        this.vehiculoId = vehiculoId;
        this.nombreCliente = nombreCliente;
        this.tipoVehiculo = tipoVehiculo;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
}
