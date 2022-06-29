package co.com.sofka.logicaempleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombresCompletos implements ValueObject<String> {

    private final String value;

    public NombresCompletos(String value) {

        if(value.length()<5){
            throw new IllegalArgumentException("El nombre del cliente no puede ser menor a 5 caracteres");
        }

        if(value.length()>50){
            throw new IllegalArgumentException("El nombre del cliente no puede ser mayor a 50 caracteres");
        }

        this.value =  Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return null;
    }
}
