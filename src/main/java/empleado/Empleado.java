package empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import empleado.entities.Funcion;
import empleado.events.*;
import empleado.values.*;
import stock.values.StockId;

import java.util.Objects;
import java.util.Set;

public class Empleado extends AggregateEvent <EmpleadoId>{
    protected Nombre nombre;
    protected Set<Funcion> funciones;
    protected StockId stockId;
    protected ContactoId contactoId;

    public Empleado (EmpleadoId entityId, Nombre nombre){
        super (entityId);
        appendChange(new EmpleadoCreado(nombre)).apply();
    }

    public void agregarFuncion (FuncionId entityId, Caracteristica caracteristica, Descripcion descripcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(caracteristica);
        Objects.requireNonNull(descripcion);
        appendChange(new FuncionAgregada (entityId, caracteristica, descripcion)).apply();
    }

    public void cambiarNombre (Nombre nombre){
        appendChange(new NombreCambiado(nombre)).apply();

    }

    public void actualizarCaracteristicaDeUnaFuncion(FuncionId entityId, Caracteristica caracteristica){
        appendChange(new CaracteristicaDeUnaFuncionActualizada(entityId, caracteristica)).apply();
    }

    public void actualizarDescripcionDeUnaFuncion(FuncionId entityId, Descripcion descripcion){
        appendChange(new DescripcionDeUnaFuncionActualizada(entityId, descripcion)).apply();
    }

    /*public void cambiarDocIdentidad(DocIdentidad docIdentidad){
        appendChange(new )
    }*/


    //public void cambiarNombre
}