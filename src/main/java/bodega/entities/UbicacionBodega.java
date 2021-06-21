package bodega.entities;

import bodega.values.*;
import co.com.sofka.domain.generic.Entity;

public class UbicacionBodega extends Entity <UbicacionBodegaId> {

    private Direccion direccion;
    private Ciudad ciudad;

    public UbicacionBodega(UbicacionBodegaId ubicacionBodegaId,  Direccion direccion, Ciudad ciudad){
        super(ubicacionBodegaId);
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public void cambiarDireccion(Direccion direccion){
        this.direccion = direccion;
    }

    public void cambiarCiudad(Ciudad ciudad){
        this.ciudad = ciudad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
}