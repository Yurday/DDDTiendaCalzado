package stock.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantTotalStock implements ValueObject<String> {

    private final String value;

    public CantTotalStock(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Cantidad total de stock sin establecer");
        }
    }

    public String value() {
        return value;
    }
}