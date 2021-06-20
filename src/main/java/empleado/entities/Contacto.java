package empleado.entities;

import co.com.sofka.domain.generic.Entity;
import empleado.values.*;

import java.util.Objects;

public class Contacto extends Entity <ContactoId> {

    private Email email;
    private NoCelular noCelular;

    public Contacto (ContactoId entityId, Email email, NoCelular noCelular){
        super(entityId);
        this.email = email;
        this.noCelular = noCelular;
    }

    public void cambiarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }
    public void cambiarNoDeCelulalr(NoCelular noCelular){
        this.noCelular = Objects.requireNonNull(noCelular);
    }

    public Email email() {
        return email;
    }

    public NoCelular noCelular() {
        return noCelular;
    }
}