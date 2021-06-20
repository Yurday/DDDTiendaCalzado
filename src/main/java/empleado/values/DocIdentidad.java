package empleado.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DocIdentidad implements ValueObject <String>{

    private final String value;

    public DocIdentidad(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Documento de identidad no relacionado");
        }
    }

    public String value() {
        return value;
    }
}