package bodega.values;

import co.com.sofka.domain.generic.Identity;

public class UbicacionBodegaId extends Identity {

    public UbicacionBodegaId(){

    }

    public UbicacionBodegaId(String id){
        super(id);
    }

    public static UbicacionBodegaId of(String id){
        return new UbicacionBodegaId(id);

    }
}