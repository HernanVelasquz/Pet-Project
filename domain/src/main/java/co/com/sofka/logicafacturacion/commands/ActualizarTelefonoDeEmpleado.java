package co.com.sofka.logicafacturacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import co.com.sofka.logicafacturacion.values.Telefono;

public class ActualizarTelefonoDeEmpleado implements Command {
    private final ParqueaderoId parqueaderoId;
    private final Telefono telefono;

    public ActualizarTelefonoDeEmpleado(ParqueaderoId parqueaderoId, Telefono telefono) {
        this.parqueaderoId = parqueaderoId;
        this.telefono = telefono;
    }

    public ParqueaderoId ObtenerPaqueaderoId(){
        return parqueaderoId;
    }

    public Telefono ObtenerTelefono() {
        return telefono;
    }
}
