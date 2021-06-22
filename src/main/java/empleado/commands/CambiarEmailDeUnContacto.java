package empleado.commands;

import co.com.sofka.domain.generic.Command;
import empleado.values.Email;
import empleado.values.EmpleadoId;

public class CambiarEmailDeUnContacto implements Command {

    private final EmpleadoId empleadoId;
    private final Email email;

    public CambiarEmailDeUnContacto(EmpleadoId empleadoId, Email email){
        this.empleadoId = empleadoId;
        this.email = email;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Email getEmail() {
        return email;
    }
}
