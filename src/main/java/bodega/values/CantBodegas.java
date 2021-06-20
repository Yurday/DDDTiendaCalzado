package bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantBodegas implements ValueObject <String> {

    private final String value;

    public CantBodegas(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Cantidad de bodegas no referenciado");
        }
    }

    public String value() {
        return value;
    }
}
