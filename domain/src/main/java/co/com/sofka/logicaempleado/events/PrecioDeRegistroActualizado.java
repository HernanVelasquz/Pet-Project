package co.com.sofka.logicafacturacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.values.Precio;

public class PrecioDeRegistroActualizado extends DomainEvent {

    private final Precio precio;

    public PrecioDeRegistroActualizado(Precio precio) {
        super("sofka.facturacion.preciodemensualidadactualizada");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}