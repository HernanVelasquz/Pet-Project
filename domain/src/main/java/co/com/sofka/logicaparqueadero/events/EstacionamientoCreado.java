package co.com.sofka.logicaparqueadero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import co.com.sofka.logicaparqueadero.values.ClienteId;
import co.com.sofka.logicaparqueadero.values.CorreoCliente;
import co.com.sofka.logicaparqueadero.values.NombreCliente;

public class EstacionamientoCreado extends DomainEvent {
    private final ParqueaderoId parqueaderoId;
    private final ClienteId clienteId;
    private final NombreCliente nombreCliente;
    private final CorreoCliente correoCliente;

    public EstacionamientoCreado(ParqueaderoId parqueaderoId, ClienteId clienteId, NombreCliente nombreCliente, CorreoCliente correoCliente) {
        super("sofka.parqueadero.parqueaderocreado");
        this.parqueaderoId = parqueaderoId;
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
    }

    public ParqueaderoId getParqueaderoId() {
        return parqueaderoId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }

    public CorreoCliente getCorreoCliente() {
        return correoCliente;
    }
}
