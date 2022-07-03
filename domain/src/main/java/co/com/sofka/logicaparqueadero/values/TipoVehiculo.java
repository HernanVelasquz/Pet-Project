package co.com.sofka.logicaparqueadero.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.logicafacturacion.values.ParqueaderoId;
import java.util.Objects;

public class TipoVehiculo implements ValueObject<TipoVehiculo.Props> {
    public interface Props{
        ParqueaderoId parqueaderoId();
        String nombre();
    }

    private final ParqueaderoId parqueaderoId;
    public final String nombre;

    public TipoVehiculo(ParqueaderoId parqueaderoId, String nombre) {
        this.parqueaderoId = Objects.requireNonNull(parqueaderoId);
        this.nombre = Objects.requireNonNull(nombre);
    }

    @Override
    public Props value() {
        return new Props() {
           @Override
           public ParqueaderoId parqueaderoId(){
               return parqueaderoId;
           }
            @Override
            public String nombre() {
                return nombre;
            }
        };
    }

}
