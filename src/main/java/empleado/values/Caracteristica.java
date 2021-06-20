package empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Caracteristica implements ValueObject<String> {

    private final String value;

    public Caracteristica(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Característica de función no asociada");
        }
    }

    public String value() {
        return value;
    }
}