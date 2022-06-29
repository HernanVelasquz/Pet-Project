package co.com.sofka.logicaparqueadero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaparqueadero.values.CorreoCliente;
import co.com.sofka.logicaparqueadero.values.EstacionamientoId;

public class CambiarCorreoDeCliente extends Command {
    private final EstacionamientoId estacionamientoId;
    private final CorreoCliente correoCliente;

    public CambiarCorreoDeCliente(EstacionamientoId estacionamientoId, CorreoCliente correoCliente) {
        this.estacionamientoId = estacionamientoId;
        this.correoCliente = correoCliente;
    }

    public EstacionamientoId getEstacionamientoId() {
        return estacionamientoId;
    }

    public CorreoCliente getCorreoCliente() {
        return correoCliente;
    }
}
