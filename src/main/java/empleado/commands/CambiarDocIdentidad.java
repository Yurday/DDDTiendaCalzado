package empleado.commands;

import co.com.sofka.domain.generic.Command;
import empleado.values.DocIdentidad;
import empleado.values.EmpleadoId;

public class CambiarDocIdentidad implements Command {

    private final EmpleadoId empleadoId;
    private final DocIdentidad docIdentidad;

    public CambiarDocIdentidad(EmpleadoId empleadoId, DocIdentidad docIdentidad){
        this.empleadoId = empleadoId;
        this.docIdentidad = docIdentidad;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public DocIdentidad getDocIdentidad() {
        return docIdentidad;
    }
}
