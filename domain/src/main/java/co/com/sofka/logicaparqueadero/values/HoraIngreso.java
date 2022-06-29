package co.com.sofka.logicaparqueadero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HoraIngreso implements ValueObject<Integer> {
    private final Integer value;

    public HoraIngreso(Integer value) {
        if(value < 1){
            throw new IllegalArgumentException("La invalida, debe ser mayor a Cero");
        }
        if(value > 12){
            throw new IllegalArgumentException("La hora invalida");
        }
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HoraIngreso)) return false;
        HoraIngreso that = (HoraIngreso) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


    @Override
    public Integer value() {
        return value;
    }
}
