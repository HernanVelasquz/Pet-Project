package co.com.sofka.logicaparqueadero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaparqueadero.values.EstacionamientoId;
import co.com.sofka.logicaparqueadero.values.NombreCliente;
import co.com.sofka.logicaparqueadero.values.TipoVehiculo;
import co.com.sofka.logicaparqueadero.values.VehiculoId;

public class AgregarVehiculo extends Command {
    private final EstacionamientoId estacionamientoId;
    private final VehiculoId vehiculoId;
    private final NombreCliente nombreCliente;
    private final TipoVehiculo tipoVehiculo;

    public AgregarVehiculo(EstacionamientoId estacionamientoId, VehiculoId vehiculoId, NombreCliente nombreCliente, TipoVehiculo tipoVehiculo) {
        this.estacionamientoId = estacionamientoId;
        this.vehiculoId = vehiculoId;
        this.nombreCliente = nombreCliente;
        this.tipoVehiculo = tipoVehiculo;
    }

    public EstacionamientoId getEstacionamientoId() {
        return estacionamientoId;
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
