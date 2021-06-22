package empleado.commands;

import co.com.sofka.domain.generic.Command;
import empleado.values.EmpleadoId;
import empleado.values.NoCelular;

public class CambiarNoDeCelularDeUnContacto implements Command {

    private final EmpleadoId empleadoId;
    private final NoCelular noCelular;

    public CambiarNoDeCelularDeUnContacto(EmpleadoId empleadoId, NoCelular noCelular){
        this.empleadoId = empleadoId;
        this.noCelular = noCelular;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public NoCelular getNoCelular() {
        return noCelular;
    }
}
