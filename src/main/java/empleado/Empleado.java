package empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import empleado.entities.Contacto;
import empleado.entities.Funcion;
import empleado.events.*;
import empleado.values.*;
import stock.values.StockId;

public class Empleado extends AggregateEvent <EmpleadoId> {
    protected Nombre nombre;
    protected Funcion funcion;
    protected StockId stockId;
    protected Contacto contacto;

    public Empleado(EmpleadoId empleadoId, Nombre nombre, Funcion funcion, Contacto contacto) {
        super(empleadoId);
        appendChange(new EmpleadoCreado(empleadoId, nombre, funcion, contacto)).apply();
    }

    private Empleado(EmpleadoId empleadoId){
        super(empleadoId);
        subscribe(new EmpleadoChange(this));
    }

    //Commands

    public void actualizarCaracteristicaDeUnaFuncion(Caracteristica caracteristica) {
        appendChange(new CaracteristicaDeUnaFuncionActualizada(caracteristica)).apply();
    }

    public void actualizarDescripcionDeUnaFuncion(Descripcion descripcion) {
        appendChange(new DescripcionDeUnaFuncionActualizada(descripcion)).apply();
    }

    public void cambiarDocIdentidad(DocIdentidad docIdentidad) {
        appendChange(new DocIdentidadCambiado(docIdentidad)).apply();
    }

    public void cambiarEmailDeUnContacto(Email email) {
        appendChange(new EmailDeUnContactoCambiado(email)).apply();
    }

    public void cambiarNoDeCelularDeUnContacto(NoCelular noCelular) {
        appendChange(new NoDeCelularDeUnContactoCambiado(noCelular)).apply();
    }

    public void CambiarNombre(Nombre nombre) {
        appendChange(new NombreCambiado(nombre)).apply();
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

    public StockId getStockId() {
        return stockId;
    }
}