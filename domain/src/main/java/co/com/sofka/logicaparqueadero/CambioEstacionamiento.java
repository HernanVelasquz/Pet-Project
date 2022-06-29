package co.com.sofka.logicaparqueadero;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.logicaparqueadero.events.*;

import java.util.ArrayList;

public class CambioEstacionamiento extends EventChange {
    public CambioEstacionamiento(Estacionamiento estacionamiento) {
        apply((EstacionamientoCreado event)->{
            estacionamiento.parqueaderoId = event.getParqueaderoId();
            estacionamiento.cliente = new Cliente(event.getClienteId(), event.getCorreoCliente(), event.getNombreCliente());
            estacionamiento.vehiculos = new ArrayList<>();
            estacionamiento.tiquetes = new ArrayList<>();
        });

        apply((HoraDeIngresoDeTiqueteCambiada event) ->{
            estacionamiento.tiquetePorId(event.getTiquetaId()).modificarHoraDeIngreso(event.getHoraIngreso());
        });

        apply((NombrePropietarioDeVehiculoCambiado event) ->{
            estacionamiento.vehiculoPorId(event.getVehiculoId()).modificarNombre(event.getNombreCliente());
        });

        apply((CorreoDeClienteCambiado event) ->{
            estacionamiento.cliente.modificarCorreo(event.getCorreoCliente());
        });

        apply((NombreDeClienteCambiado event) ->{
            estacionamiento.cliente.modificadorNombre(event.getNombreCliente());
        });

        apply((TiqueteAgregado event) ->{
            estacionamiento.tiquetes.add(new Tiquete(
                    event.getTiqueteId(),
                    event.getTipoVehiculo(),
                    event.getHoraIngreso()
            ));
        });

        apply((VehiculoAgregado event) ->{
            estacionamiento.vehiculos.add(new Vehiculo(
                    event.getVehiculoId(),
                    event.getNombreCliente(),
                    event.getTipoVehiculo()
            ));
        });
    }
}
