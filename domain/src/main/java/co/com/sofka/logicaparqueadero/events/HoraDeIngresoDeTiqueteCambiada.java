package co.com.sofka.logicaparqueadero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaparqueadero.values.HoraIngreso;
import co.com.sofka.logicaparqueadero.values.TiqueteId;

public class HoraDeIngresoDeTiqueteCambiada extends DomainEvent {
    private final TiqueteId tiquetaId;
    private final HoraIngreso horaIngreso;

    public HoraDeIngresoDeTiqueteCambiada(TiqueteId tiquetaId, HoraIngreso horaIngreso) {
        super("sofka.parqueadero.horadeingresodetiquetecambiada");
        this.tiquetaId = tiquetaId;
        this.horaIngreso = horaIngreso;
    }

    public TiqueteId getTiquetaId() {
        return tiquetaId;
    }

    public HoraIngreso getHoraIngreso() {
        return horaIngreso;
    }
}
