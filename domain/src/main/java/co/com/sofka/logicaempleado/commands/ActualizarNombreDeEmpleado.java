package co.com.sofka.logicafacturacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicafacturacion.values.Nombre;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;

public class ActualizarNombreDeEmpleado extends Command {
    private final ParqueaderoId parqueaderoId;
    private final Nombre nombre;

    public ActualizarNombreDeEmpleado(ParqueaderoId parqueaderoId, Nombre nombre) {
        this.parqueaderoId = parqueaderoId;
        this.nombre = nombre;
    }

    public ParqueaderoId ObtenerParqueaderoId() {
        return parqueaderoId;
    }

    public Nombre ObtnerNombre() {
        return nombre;
    }
}
