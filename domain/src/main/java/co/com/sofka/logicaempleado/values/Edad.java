package co.com.sofka.logicaempleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Edad implements ValueObject<Integer> {

    private final Integer value;
    

    public Edad(Integer value) {
        boolean isNumeric = true;


        if (value < 18) {
            throw new IllegalArgumentException("Solo se permiten mayores de edad");
        }
        if (value < 0) {
            throw new IllegalArgumentException("La edad no es correcta");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return null;
    }
}
