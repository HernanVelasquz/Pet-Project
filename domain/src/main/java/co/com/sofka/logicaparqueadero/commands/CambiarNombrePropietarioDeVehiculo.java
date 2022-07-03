package co.com.sofka.logicaparqueadero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaparqueadero.values.EstacionamientoId;
import co.com.sofka.logicaparqueadero.values.NombreCliente;
import co.com.sofka.logicaparqueadero.values.VehiculoId;

public class CambiarNombrePropietarioDeVehiculo extends Command {
    private final EstacionamientoId estacionamientoId;
    private final VehiculoId vehiculoId;
    private final NombreCliente nombreCliente;

    public CambiarNombrePropietarioDeVehiculo(EstacionamientoId estacionamientoId, VehiculoId vehiculoId, NombreCliente nombreCliente) {
        this.estacionamientoId = estacionamientoId;
        this.vehiculoId = vehiculoId;
        this.nombreCliente = nombreCliente;
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
}
