package stock.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MarcaGuayosDisp implements ValueObject<String> {

    private final String value;

    public MarcaGuayosDisp(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Marcas de guayos disponible sin establecer");
        }
    }

    public String value() {
        return value;
    }
}