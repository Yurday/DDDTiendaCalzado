package empleado;

import co.com.sofka.domain.generic.EventChange;
import empleado.events.*;

public class EmpleadoChange extends EventChange {

    public EmpleadoChange(Empleado empleado){

        apply((EmpleadoCreado event) ->{
            empleado.nombre = event.getNombre();
            empleado.funcion = event.getFuncion();
            empleado.contacto = event.getContacto();
        });

        apply((CaracteristicaDeUnaFuncionActualizada event) ->{
            empleado.funcion.actualizarCaracteristica(event.getCaracteristica());
        });

        apply((DescripcionDeUnaFuncionActualizada event) ->{
            empleado.funcion.actualizarDescripcion(event.getDescripcion());
        });

        apply((DocIdentidadCambiado event) ->{
            empleado.cambiarDocIdentidad(event.getDocIdentidad());
        });

        apply((EmailDeUnContactoCambiado event) ->{
            empleado.cambiarEmailDeUnContacto(event.getEmail());
        });

        apply((NoDeCelularDeUnContactoCambiado event) ->{
            empleado.cambiarNoDeCelularDeUnContacto(event.getNoCelular());
        });
    }
}