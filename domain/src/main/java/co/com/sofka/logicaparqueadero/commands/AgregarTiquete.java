package co.com.sofka.logicaparqueadero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaparqueadero.values.EstacionamientoId;
import co.com.sofka.logicaparqueadero.values.HoraIngreso;
import co.com.sofka.logicaparqueadero.values.TipoVehiculo;
import co.com.sofka.logicaparqueadero.values.TiqueteId;

public class AgregarTiquete extends Command {
    private final EstacionamientoId estacionamientoId;
    private final TiqueteId tiqueteId;
    private final TipoVehiculo tipoVehiculo;
    private final HoraIngreso horaIngreso;

    public AgregarTiquete(EstacionamientoId estacionamientoId, TiqueteId tiqueteId, TipoVehiculo tipoVehiculo, HoraIngreso horaIngreso) {
        this.estacionamientoId = estacionamientoId;
        this.tiqueteId = tiqueteId;
        this.tipoVehiculo = tipoVehiculo;
        this.horaIngreso = horaIngreso;
    }

    public EstacionamientoId getEstacionamientoId() {
        return estacionamientoId;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public HoraIngreso getHoraIngreso() {
        return horaIngreso;
    }
}
