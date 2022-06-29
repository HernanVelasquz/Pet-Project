package co.com.sofka.logicaparqueadero;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicaparqueadero.values.ClienteId;
import co.com.sofka.logicaparqueadero.values.CorreoCliente;
import co.com.sofka.logicaparqueadero.values.NombreCliente;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {

    protected CorreoCliente correoCliente;
    protected NombreCliente nombreCliente;

    protected Cliente(ClienteId entityId,CorreoCliente correoCliente, NombreCliente nombreCliente) {
        super(entityId);
        this.correoCliente = correoCliente;
        this.nombreCliente = nombreCliente;
    }

    public void modificarCorreo(CorreoCliente correoCliente){
        this.correoCliente = Objects.requireNonNull(correoCliente);
    }

    public void modificadorNombre(NombreCliente nombreCliente){
        this.nombreCliente = Objects.requireNonNull(nombreCliente);
    }

    public CorreoCliente getCorreoCliente(){
        return correoCliente;
    }

    public NombreCliente getNombreCliente(){
        return  nombreCliente;
    }
}
