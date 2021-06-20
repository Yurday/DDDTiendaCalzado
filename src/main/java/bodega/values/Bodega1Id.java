package bodega.values;

import co.com.sofka.domain.generic.Identity;

public class Bodega1Id extends Identity {

    public Bodega1Id(){

    }

    public Bodega1Id(String id){
        super(id);
    }

    public static Bodega1Id of(String id){
        return new Bodega1Id(id);

    }
}