package stock.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadTenisDisp implements ValueObject<String> {

    private final String value;

    public CantidadTenisDisp(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Cantidad de tenis disponible sin establecer");
        }
    }

    public String value() {
        return value;
    }
}