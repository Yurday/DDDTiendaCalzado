package empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NoCelular implements ValueObject<String> {

    private final String value;

    public NoCelular(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Número de celular no asociado");
        }
    }

    public String value() {
        return value;
    }
}