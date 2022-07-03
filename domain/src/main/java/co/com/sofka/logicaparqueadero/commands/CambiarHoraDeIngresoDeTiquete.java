package co.com.sofka.logicaparqueadero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicaparqueadero.values.EstacionamientoId;
import co.com.sofka.logicaparqueadero.values.HoraIngreso;
import co.com.sofka.logicaparqueadero.values.TiqueteId;

public class CambiarHoraDeIngresoDeTiquete extends Command {
    private final EstacionamientoId estacionamientoId;
    private final TiqueteId tiqueteId;
    private final HoraIngreso horaIngreso;

    public CambiarHoraDeIngresoDeTiquete(EstacionamientoId estacionamientoId, TiqueteId tiqueteId, HoraIngreso horaIngreso) {
        this.estacionamientoId = estacionamientoId;
        this.tiqueteId = tiqueteId;
        this.horaIngreso = horaIngreso;
    }

    public EstacionamientoId getEstacionamientoId() {
        return estacionamientoId;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public HoraIngreso getHoraIngreso() {
        return horaIngreso;
    }
}
