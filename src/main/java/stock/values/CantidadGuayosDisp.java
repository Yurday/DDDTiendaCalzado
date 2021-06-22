package stock.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadGuayosDisp implements ValueObject<String> {

    private final String value;

    public CantidadGuayosDisp(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Cantidad de guayos disponible sin establecer");
        }
    }

    public String value() {
        return value;
    }
}