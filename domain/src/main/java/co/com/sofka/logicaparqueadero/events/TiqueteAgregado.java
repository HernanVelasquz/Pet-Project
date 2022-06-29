package co.com.sofka.logicaparqueadero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaparqueadero.values.HoraIngreso;
import co.com.sofka.logicaparqueadero.values.TipoVehiculo;
import co.com.sofka.logicaparqueadero.values.TiqueteId;

public class TiqueteAgregado extends DomainEvent {
    private final TiqueteId tiqueteId;
    private final TipoVehiculo tipoVehiculo;
    private final HoraIngreso horaIngreso;

    public TiqueteAgregado(TiqueteId tiqueteId, TipoVehiculo tipoVehiculo, HoraIngreso horaIngreso) {
        super("sofka.parqueadero.tiqueteagregado");
        this.tiqueteId = tiqueteId;
        this.tipoVehiculo = tipoVehiculo;
        this.horaIngreso = horaIngreso;
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
