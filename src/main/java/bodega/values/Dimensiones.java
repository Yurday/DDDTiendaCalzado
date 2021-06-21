package bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Dimensiones implements ValueObject <String> {

    private final String value;

    public Dimensiones(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Dimensiones de la bodega sin mencionar");
        }
    }

    public String value() {
        return value;
    }
}
