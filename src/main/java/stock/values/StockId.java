package stock.values;

import co.com.sofka.domain.generic.Identity;

public class StockId extends Identity {

    public StockId(){

    }

    public StockId(String id){
        super(id);
    }

    public static StockId of(String id){
        return new StockId(id);

    }
}