package stock.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca implements ValueObject<String> {

    private final String value;

    public Marca(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Marca no relacionada");
        }
    }

    public String value() {
        return value;
    }
}