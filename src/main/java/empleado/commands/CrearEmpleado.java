package empleado.commands;

import co.com.sofka.domain.generic.Command;
import empleado.entities.Contacto;
import empleado.entities.Funcion;
import empleado.values.DocIdentidad;
import empleado.values.EmpleadoId;
import empleado.values.Nombre;

public class CrearEmpleado implements Command {

    private final EmpleadoId empleadoId;
    private final Nombre nombre;
    private final DocIdentidad docIdentidad;
    private final Funcion funcion;
    private final Contacto contacto;

    public CrearEmpleado(EmpleadoId empleadoId, Nombre nombre, DocIdentidad docIdentidad, Funcion funcion, Contacto contacto){
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.docIdentidad = docIdentidad;
        this.funcion = funcion;
        this.contacto = contacto;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public DocIdentidad getDocIdentidad() {
        return docIdentidad;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public Contacto getContacto() {
        return contacto;
    }
}