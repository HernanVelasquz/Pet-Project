package co.com.sofka.logicafacturacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logicafacturacion.values.HoraSalida;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;

public class ActualizarHoraSalidaDeFactura implements Command {
    private final ParqueaderoId parqueaderoId;
    private final HoraSalida horaSalida;

    public ActualizarHoraSalidaDeFactura(ParqueaderoId parqueaderoId, HoraSalida horaSalida) {
        this.parqueaderoId = parqueaderoId;
        this.horaSalida = horaSalida;
    }

    public ParqueaderoId ObtenerParqueaderoId() {
        return parqueaderoId;
    }

    public HoraSalida ObtenerHoraSalida() {
        return horaSalida;
    }
}
