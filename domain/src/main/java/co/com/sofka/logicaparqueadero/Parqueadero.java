package co.com.sofka.logicaparqueadero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.logicaparqueadero.values.*;

import java.util.List;

public class Parqueadero extends AggregateEvent<ParqueaderoId> {
    protected NombreCliente nombreCliente;
    protected CorreoCliente correoCliente;
    protected ParqueaderoId parqueaderoId;
    protected Cliente cliente;
    protected List<Vehiculo> vehiculos;
    protected List<Tiquete> tiquetes;
    private TiquetaId tiquetaId;
    private HoraIngreso horaIngreso;

    public Parqueadero()

}
