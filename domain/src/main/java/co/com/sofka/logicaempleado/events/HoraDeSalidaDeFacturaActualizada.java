package co.com.sofka.logicafacturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.values.HoraSalida;

public class HoraDeSalidaDeFacturaActualizada extends DomainEvent {

    private final HoraSalida horaSalida;

    public HoraDeSalidaDeFacturaActualizada(HoraSalida horaSalida) {
        super("sofka.facturacion.horadesalidadefacturaactualizada");
        this.horaSalida = horaSalida;
    }

    public HoraSalida getHoraSalida() {
        return horaSalida;
    }
}
