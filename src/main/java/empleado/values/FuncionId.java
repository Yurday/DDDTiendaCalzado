package empleado.values;

import bodega.values.BodegaId;
import co.com.sofka.domain.generic.Identity;

public class FuncionId extends Identity {

    public FuncionId(){

    }

    public FuncionId(String id){
        super(id);
    }

    public static FuncionId of(String id){
        return new FuncionId(id);

    }
}