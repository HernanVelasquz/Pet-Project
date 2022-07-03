package co.com.sofka.logicaparqueadero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaparqueadero.values.EstacionamientoId;
import co.com.sofka.logicaparqueadero.values.NombreCliente;

public class CambiarNombreDeCliente extends Command {
    private final EstacionamientoId estacionamientoId;
    private final NombreCliente nombreCliente;

    public CambiarNombreDeCliente(EstacionamientoId estacionamientoId, NombreCliente nombreCliente) {
        this.estacionamientoId = estacionamientoId;
        this.nombreCliente = nombreCliente;
    }

    public EstacionamientoId getEstacionamientoId() {
        return estacionamientoId;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }
}
