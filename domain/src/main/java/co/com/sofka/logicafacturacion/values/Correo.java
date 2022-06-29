package co.com.sofka.logicafacturacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {

    private final String value;

    public Correo(String value) {

        if(value.length()<12){
            throw new IllegalArgumentException("El Correo no puede ser menor a 12 caracteres");
        }

        if(!value.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new IllegalArgumentException("El correo no cumple con el formato requerido");
        }

        this.value = Objects.requireNonNull(value);
    }



    @Override
    public String value() {
        return value;
    }
}
