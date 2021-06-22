package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.entities.Contacto;
import empleado.entities.Funcion;
import empleado.values.EmpleadoId;
import empleado.values.Nombre;

public class EmpleadoCreado extends DomainEvent {

    private final EmpleadoId empleadoId;
    private final Nombre nombre;
    private final Funcion funcion;
    private final Contacto contacto;

    public EmpleadoCreado(EmpleadoId empleadoId, Nombre nombre, Funcion funcion, Contacto contacto){
        super("tiendadecalzado.empleado.empleadocreado");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.funcion = funcion;
        this.contacto = contacto;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public Contacto getContacto() {
        return contacto;
    }
}
