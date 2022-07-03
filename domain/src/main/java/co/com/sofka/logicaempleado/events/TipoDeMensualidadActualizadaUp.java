package co.com.sofka.logicafacturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.values.TipoMensualidad;

public class TipoDeMensualidadActualizadaUp extends DomainEvent {

    private final TipoMensualidad tipoMensualidad;

    public TipoDeMensualidadActualizadaUp(TipoMensualidad tipoMensualidad) {
        super("sofka.facturacion.tipodemensualidadactualizadaup");
        this.tipoMensualidad = tipoMensualidad;
    }

    public TipoMensualidad getTipoMensualidad() {
        return tipoMensualidad;
    }
}