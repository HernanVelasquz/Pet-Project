package co.com.sofka.logicafacturacion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logicafacturacion.values.Precio;
import co.com.sofka.logicafacturacion.values.RegistroId;
import co.com.sofka.logicafacturacion.values.TipoMensualidad;

public class Registro extends Entity<RegistroId> {

    protected Precio precio;
    protected TipoMensualidad tipoMensualidad;

    public Registro(RegistroId entityId, Precio precio, TipoMensualidad tipoMensualidad) {
        super(entityId);
        this.precio = precio;
        this.tipoMensualidad = tipoMensualidad;
    }

    public void aumentarTipoMensualidad(TipoMensualidad tipoMensualidad){
        this.tipoMensualidad = tipoMensualidad;
    }

    public void disminuirTipoMensualidad(TipoMensualidad tipoMensualidad){
        this.tipoMensualidad = tipoMensualidad;
    }

    public void modificarPrecio(Precio precio){
        this.precio = precio;
    }

    public Precio precio(){
        return this.precio;
    }

    public TipoMensualidad tipoMensualidad(){
        return this.tipoMensualidad;
    }
}
