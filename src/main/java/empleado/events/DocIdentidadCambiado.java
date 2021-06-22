package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.DocIdentidad;

public class DocIdentidadCambiado extends DomainEvent {

    private final DocIdentidad docIdentidad;

    public DocIdentidadCambiado(DocIdentidad docIdentidad){
        super("tiendadecalzado.empleado.docidentidadcambiado ");
        this.docIdentidad = docIdentidad;
    }

    public DocIdentidad getDocIdentidad() {
        return docIdentidad;
    }
}