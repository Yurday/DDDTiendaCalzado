package stock.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MarcaTenisDisp implements ValueObject<String> {

    private final String value;

    public MarcaTenisDisp(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Marcas de tenis disponible sin establecer");
        }
    }

    public String value() {
        return value;
    }
}