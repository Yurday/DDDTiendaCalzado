package bodega;

import bodega.events.*;
import co.com.sofka.domain.generic.EventChange;

public class BodegaChange extends EventChange {
    public BodegaChange(Bodega bodega) {

        apply((BodegaAgregada event) -> {
            bodega.nombreBodega = event.getNombreBodega();
            bodega.informacionBodega = event.getInformacionBodega();
            bodega.ubicacionBodega = event.getUbicacionBodega();
        });

        apply((CapacidadDeInformacionBodegaCambiada event) ->{
            bodega.informacionBodega.cambiarCapacidad(event.getCapacidad());
        });

        apply((CiudadDeUbicacionBodegaCambiada event) ->{
            bodega.ubicacionBodega.cambiarCiudad(event.getCiudad());
        });

        apply((DimensionesDeInformacionBodegaCambiada event) ->{
            bodega.informacionBodega.cambiarDimensiones(event.getDimensiones());
        });

        apply((DireccionDeUbicacionBodegaCambiada event) ->{
            bodega.ubicacionBodega.cambiarDireccion(event.getDireccion());
        });

        apply((NombreDeBodegaCambiado event) ->{
            bodega.cambiarNombreBodega(event.getNombreBodega());
        });
    }
}
