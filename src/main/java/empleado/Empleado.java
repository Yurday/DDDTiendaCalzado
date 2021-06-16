package empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import empleado.values.ContactoId;
import empleado.values.EmpleadoId;
import empleado.values.Nombre;
import stock.values.StockId;

import java.util.Set;

public class Empleado extends AggregateEvent <EmpleadoId>{
    protected Nombre nombre;
    protected Set<Funcion> funciones;
    protected StockId stockId;
    protected ContactoId contactoId;

    public Empleado (EmpleadoId entityId, Nombre nombre){
        super (entityId);
    }

    protected
    protected
    protected
}
