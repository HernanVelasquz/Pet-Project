package co.com.sofka.logicaparqueadero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logicaparqueadero.events.*;
import co.com.sofka.logicaparqueadero.values.*;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;

import java.util.List;
import java.util.Objects;

public class Estacionamiento extends AggregateEvent<EstacionamientoId> {
    protected NombreCliente nombreCliente;
    protected CorreoCliente correoCliente;
    protected ParqueaderoId parqueaderoId;
    protected Cliente cliente;
    protected List<Vehiculo> vehiculos;
    protected List<Tiquete> tiquetes;
    private TiqueteId tiquetaId;
    private HoraIngreso horaIngreso;

    public Estacionamiento(EstacionamientoId entityId, NombreCliente nombreCliente, CorreoCliente correoCliente, ParqueaderoId parqueaderoId) {
        super(entityId);
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        Objects.requireNonNull(parqueaderoId);
        Objects.requireNonNull(nombreCliente);
        Objects.requireNonNull(correoCliente);
        var estacionamientoId = new ClienteId();
    }

    public Estacionamiento(EstacionamientoId estacionamientoId){
        super(estacionamientoId);
        subscribe(new CambioEstacionamiento(this));
    }

    public static Estacionamiento from(EstacionamientoId idPublicacion, List<DomainEvent> events){
        var estacionamiento = new Estacionamiento(idPublicacion);
        events.forEach(estacionamiento::applyEvent);
        return estacionamiento;
    }

    public void cambiarHoraIngresoDeTiquete(TiqueteId tiquetaId, HoraIngreso horaIngreso){
        this.tiquetaId = tiquetaId;
        this.horaIngreso = horaIngreso;
        Objects.requireNonNull(tiquetaId);
        Objects.requireNonNull(horaIngreso);
        appendChange(new HoraDeIngresoDeTiqueteCambiada(tiquetaId,horaIngreso)).apply();
    }

    public void cambiarNombrePropietarioDeVehiculo(VehiculoId vehiculoId, NombreCliente nombreCliente){
        Objects.requireNonNull(vehiculoId);
        Objects.requireNonNull(nombreCliente);
        appendChange(new NombrePropietarioDeVehiculoCambiado(vehiculoId,nombreCliente)).apply();
    }

    public void cambiarCorreoDeCliente(CorreoCliente correoCliente){
        Objects.requireNonNull(correoCliente);
        appendChange(new CorreoDeClienteCambiado(correoCliente)).apply();
    }

    public void cambiarNombreDeCliente(NombreCliente nombreCliente){
        Objects.requireNonNull(nombreCliente);
        appendChange(new NombreDeClienteCambiado(nombreCliente)).apply();
    }

    public void agregarTiquete(TiqueteId tiquetaId, TipoVehiculo tipoVehiculo, HoraIngreso horaIngreso){
        Objects.requireNonNull(tiquetaId);
        Objects.requireNonNull(tipoVehiculo);
        Objects.requireNonNull(horaIngreso);
        appendChange(new TiqueteAgregado(tiquetaId, tipoVehiculo,horaIngreso)).apply();
    }

    public void agregarVehiculo(VehiculoId vehiculoId, NombreCliente nombreCliente, TipoVehiculo tipoVehiculo){
        Objects.requireNonNull(vehiculoId);
        Objects.requireNonNull(nombreCliente);
        Objects.requireNonNull(tipoVehiculo);
        appendChange(new VehiculoAgregado(vehiculoId,nombreCliente,tipoVehiculo)).apply();
    }

    public Tiquete tiquetePorId(TiqueteId tiqueteId){
        return tiquetes.stream().filter(valor -> valor.identity().equals(tiqueteId)).findFirst().orElseThrow();
    }

    public Vehiculo vehiculoPorId(VehiculoId vehiculoId){
        return vehiculos.stream().filter(vehiculo -> vehiculo.identity().equals(vehiculoId)).findFirst().orElseThrow();
    }

    public ParqueaderoId idUsuario() {
        return parqueaderoId;
    }

    public Cliente contenido() {
        return cliente;
    }

    public List<Vehiculo> comentarios() {
        return vehiculos;
    }

    public List<Tiquete> tiquetes() {
        return tiquetes;
    }
}
