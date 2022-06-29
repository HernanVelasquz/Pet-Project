package co.com.sofka.logicafacturacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import co.com.sofka.logicafacturacion.values.TipoMensualidad;

public class EditarTipoMensualidadUpDeRegistro implements Command {
    private final ParqueaderoId parqueaderoId;
    private final TipoMensualidad tipoMensualidad;



    public EditarTipoMensualidadUpDeRegistro(ParqueaderoId parqueaderoId, TipoMensualidad tipoMensualidad) {
        this.parqueaderoId = parqueaderoId;
        this.tipoMensualidad = tipoMensualidad;
    }

    public ParqueaderoId ObtenerParqueaderoId() {
        return parqueaderoId;
    }

    public TipoMensualidad obtenerTipoMensualidad() {
        return tipoMensualidad;
    }

}
