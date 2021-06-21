package bodega.values;

import co.com.sofka.domain.generic.Identity;

public class InformacionBodegaId extends Identity {

    public InformacionBodegaId(){

    }

    public InformacionBodegaId(String id){
        super(id);
    }

    public static InformacionBodegaId of(String id){
        return new InformacionBodegaId(id);

    }
}