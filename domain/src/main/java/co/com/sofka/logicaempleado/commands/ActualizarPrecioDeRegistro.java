package co.com.sofka.logicafacturacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import co.com.sofka.logicafacturacion.values.Precio;

public class ActualizarPrecioDeRegistro extends Command {
    private final ParqueaderoId parqueaderoId;
    private final Precio precio;

    public ActualizarPrecioDeRegistro(ParqueaderoId parqueaderoId, Precio precio) {
        this.parqueaderoId = parqueaderoId;
        this.precio = precio;
    }

    public ParqueaderoId ObtenerParqueaderoId() {
        return parqueaderoId;
    }

    public Precio ObtenerPrecio() {
        return precio;
    }
}
