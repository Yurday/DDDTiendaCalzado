package empleado.commands;

import co.com.sofka.domain.generic.Command;
import empleado.values.Descripcion;
import empleado.values.EmpleadoId;

public class ActualizarDescripcionDeUnaFuncion implements Command {

    private final EmpleadoId empleadoId;
    private final Descripcion descripcion;

    public ActualizarDescripcionDeUnaFuncion(EmpleadoId empleadoId, Descripcion descripcion){
        this.empleadoId = empleadoId;
        this.descripcion = descripcion;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}