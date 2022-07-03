package co.com.sofka.logicaparqueadero;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicaparqueadero.values.NombreCliente;
import co.com.sofka.logicaparqueadero.values.TipoVehiculo;
import co.com.sofka.logicaparqueadero.values.VehiculoId;

import java.util.Objects;

public class Vehiculo extends Entity<VehiculoId> {
    protected NombreCliente nombreCliente;
    protected TipoVehiculo tipoVehiculo;

    public Vehiculo(VehiculoId entityId, NombreCliente nombreCliente, TipoVehiculo tipoVehiculo) {
        super(entityId);
        this.nombreCliente = nombreCliente;
        this.tipoVehiculo = tipoVehiculo;
    }

    public void modificarNombre(NombreCliente nombreCliente){
        this.nombreCliente = Objects.requireNonNull(nombreCliente);
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }
}
