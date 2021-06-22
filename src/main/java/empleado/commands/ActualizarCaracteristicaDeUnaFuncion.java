package empleado.commands;

import co.com.sofka.domain.generic.Command;
import empleado.values.Caracteristica;
import empleado.values.EmpleadoId;

public class ActualizarCaracteristicaDeUnaFuncion implements Command {

    private final EmpleadoId empleadoId;
    private final Caracteristica caracteristica;

    public ActualizarCaracteristicaDeUnaFuncion(EmpleadoId empleadoId, Caracteristica caracteristica){
        this.empleadoId = empleadoId;
        this.caracteristica = caracteristica;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }
}