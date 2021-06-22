package stock.values;

import co.com.sofka.domain.generic.Identity;

public class StockGuayosId extends Identity {

    public StockGuayosId(){

    }

    public StockGuayosId(String id){
        super(id);
    }

    public static StockGuayosId of(String id){
        return new StockGuayosId(id);

    }
}