package bodega.values;

import co.com.sofka.domain.generic.Identity;

public class Bodega2Id extends Identity {

    public Bodega2Id(){

    }

    public Bodega2Id(String id){
        super(id);
    }

    public static Bodega2Id of(String id){
        return new Bodega2Id(id);

    }
}