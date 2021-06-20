package bodega.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreBodega implements ValueObject <String> {

    private final String value;

    public NombreBodega(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Nombre de bodega no relacionado");
        }
    }

    public String value() {
        return value;
    }
}
