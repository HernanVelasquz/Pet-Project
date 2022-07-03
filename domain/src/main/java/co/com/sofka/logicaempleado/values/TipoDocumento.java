package co.com.sofka.logicaempleado.values;

import co.com.sofka.domain.generic.ValueObject;

public class TipoDocumento implements ValueObject<String> {
    private final String value;

    public TipoDocumento(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
