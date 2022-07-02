package co.com.sofka.logicaparqueadero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCliente implements ValueObject<String> {
    private final String value;

    public NombreCliente(String value) {
        if (value.length() < 5){
            throw new IllegalArgumentException("No es permitido que el nombre del cliente no debe ser menor de 5 caracteres");
        }
        if(value.length() > 50){
            throw new IllegalArgumentException(("No es permitido que el nombre del cliente no debe ser mayor de 50 caracteres"));
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NombreCliente)) return false;
        NombreCliente that = (NombreCliente) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value(){
        return value;
    }
}
