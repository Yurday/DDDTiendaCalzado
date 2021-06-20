package stock.values;

import bodega.values.BodegaId;
import co.com.sofka.domain.generic.Identity;

public class StockTenisId extends Identity {

    public StockTenisId(){

    }

    public StockTenisId(String id){
        super(id);
    }

    public static StockTenisId of(String id){
        return new StockTenisId(id);

    }
}