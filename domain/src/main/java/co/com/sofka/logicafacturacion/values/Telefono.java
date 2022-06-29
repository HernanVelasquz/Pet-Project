package co.com.sofka.logicafacturacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

<<<<<<< HEAD
public class Telefono implements ValueObject<String> {

    private final String value;

    public Telefono(String value) {
        if(value.length()<7){
            throw new IllegalArgumentException("El telefono no puede ser menor a 8 caracteres");
        }

        if(value.length()>10){
            throw new IllegalArgumentException("El telefono no puede ser mayor a 10caracteres");
        }
=======
public class Telefono implements ValueObject<Integer> {

    private final Integer value;

    public Telefono(Integer value) {

        if(value < 10){
            throw new IllegalArgumentException("Numero demasiado corto");
        }
        if(value > 10){
            throw new IllegalArgumentException("Numero demasiado largo");
        }

>>>>>>> 66a4acb278e6013aaea519e5976b77555bfe542b
        this.value = Objects.requireNonNull(value);
    }

    @Override
<<<<<<< HEAD
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        var telefono1 = (Telefono) o;
        return Objects.equals(value, telefono1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
=======
    public Integer value() {
        return null;
    }
}
>>>>>>> 66a4acb278e6013aaea519e5976b77555bfe542b
