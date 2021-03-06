package empleado.entities;

import co.com.sofka.domain.generic.Entity;
import empleado.values.Caracteristica;
import empleado.values.Descripcion;
import empleado.values.FuncionId;

import java.util.Objects;

public class Funcion extends Entity<FuncionId> {

    private Caracteristica caracteristica;
    private Descripcion descripcion;

    public Funcion (FuncionId entityId, Caracteristica caracteristica, Descripcion descripcion){
        super(entityId);
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }
    public void actualizarCaracteristica(Caracteristica caracteristica){
        this.caracteristica = Objects.requireNonNull(caracteristica);
    }

    public Caracteristica caracteristica() {
        return caracteristica;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}