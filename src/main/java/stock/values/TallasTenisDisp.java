package stock.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class TallasTenisDisp implements ValueObject<String> {

    private final String value;

    public TallasTenisDisp(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Tallas de tenis disponible sin establecer");
        }
    }

    public String value() {
        return value;
    }
}