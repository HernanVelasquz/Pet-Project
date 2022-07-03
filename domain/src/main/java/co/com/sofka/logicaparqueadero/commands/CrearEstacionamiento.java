package co.com.sofka.logicaparqueadero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import co.com.sofka.logicaparqueadero.values.CorreoCliente;
import co.com.sofka.logicaparqueadero.values.EstacionamientoId;
import co.com.sofka.logicaparqueadero.values.NombreCliente;

public class CrearEstacionamiento extends Command {

    private final ParqueaderoId parqueaderoId;
    private final EstacionamientoId estacionamientoId;
    private final NombreCliente nombreCliente;
    private final CorreoCliente correoCliente;

    public CrearEstacionamiento(ParqueaderoId parqueaderoId, EstacionamientoId estacionamientoId, NombreCliente nombreCliente, CorreoCliente correoCliente) {
        this.parqueaderoId = parqueaderoId;
        this.estacionamientoId = estacionamientoId;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
    }

    public ParqueaderoId getParqueaderoId() {
        return parqueaderoId;
    }

    public EstacionamientoId getEstacionamientoId() {
        return estacionamientoId;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }

    public CorreoCliente getCorreoCliente() {
        return correoCliente;
    }
}

