package stock.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class TallasGuayosDisp implements ValueObject<String> {

    private final String value;

    public TallasGuayosDisp(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Tallas de guayos disponible sin establecer");
        }
    }

    public String value() {
        return value;
    }
}