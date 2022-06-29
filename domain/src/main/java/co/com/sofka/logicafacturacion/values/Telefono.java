package co.com.sofka.logicafacturacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Telefono implements ValueObject<Integer> {

    private final Integer value;

    public Telefono(Integer value) {

        if(value < 10){
            throw new IllegalArgumentException("Numero demasiado corto");
        }
        if(value > 10){
            throw new IllegalArgumentException("Numero demasiado largo");
        }

        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return null;
    }
}
