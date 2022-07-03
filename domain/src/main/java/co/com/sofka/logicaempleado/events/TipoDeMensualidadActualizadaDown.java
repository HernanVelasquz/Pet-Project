package co.com.sofka.logicafacturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.values.TipoMensualidad;

public class TipoDeMensualidadActualizadaDown extends DomainEvent {

    private final TipoMensualidad tipoMensualidad;

    public TipoDeMensualidadActualizadaDown(TipoMensualidad tipoMensualidad) {
        super("sofka.facturacion.tipodemensualidadactualizadadown");
        this.tipoMensualidad = tipoMensualidad;
    }

    public TipoMensualidad getTipoMensualidad() {
        return tipoMensualidad;
    }
}