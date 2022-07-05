package co.com.sofka.logicaempleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroDocumento implements ValueObject<Integer> {

    private final Integer value;
    

    public NumeroDocumento(Integer value) {
        boolean isNumeric = true;


        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return null;
    }
}
