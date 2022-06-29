package co.com.sofka.logicaparqueadero;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicaparqueadero.values.HoraIngreso;
import co.com.sofka.logicaparqueadero.values.TipoVehiculo;
import co.com.sofka.logicaparqueadero.values.TiqueteId;

import java.util.Objects;

public class Tiquete extends Entity<TiqueteId> {
    protected TipoVehiculo tipoVehiculo;
    protected HoraIngreso horaIngreso;

    public Tiquete(TiqueteId entityId, TipoVehiculo tipoVehiculo, HoraIngreso horaIngreso) {
        super(entityId);
        this.tipoVehiculo = tipoVehiculo;
        this.horaIngreso = horaIngreso;
    }

    public void modificarHoraDeIngreso(HoraIngreso horaIngreso) {
        this.horaIngreso = Objects.requireNonNull(horaIngreso);
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public HoraIngreso getHoraIngreso() {
        return horaIngreso;
    }
}
