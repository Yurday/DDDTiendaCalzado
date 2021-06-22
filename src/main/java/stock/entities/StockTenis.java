package stock.entities;

import co.com.sofka.domain.generic.Entity;
import stock.values.*;

import java.util.Objects;

public class StockTenis extends Entity <StockTenisId> {

    private MarcaTenisDisp marcaTenisDisp;
    private TallasTenisDisp tallasTenisDisp;
    private CantidadTenisDisp cantTenisDisp;

    public StockTenis(StockTenisId stockTenisId, MarcaTenisDisp marcaTenisDisp, TallasTenisDisp tallasTenisDisp, CantidadTenisDisp cantTenisDisp){
        super(stockTenisId);
        this.marcaTenisDisp = marcaTenisDisp;
        this.tallasTenisDisp = tallasTenisDisp;
        this.cantTenisDisp = cantTenisDisp;
    }

    public void actualizarMarcaGuayosDisp(MarcaTenisDisp marcaTenisDisp){
        this.marcaTenisDisp = Objects.requireNonNull(marcaTenisDisp);
    }

    public void actualizarTallasGuayosDisp(TallasTenisDisp tallasTenisDisp){
        this.tallasTenisDisp = Objects.requireNonNull(tallasTenisDisp);
    }

    public void actualizarCantGuayosDisp(CantidadTenisDisp cantTenisDisp){
        this.cantTenisDisp = Objects.requireNonNull(cantTenisDisp);
    }

    public MarcaTenisDisp marcaTenisDisp(MarcaTenisDisp marcaTenisDisp) {
        return this.marcaTenisDisp;
    }

    public TallasTenisDisp tallasTenisDisp(TallasTenisDisp tallasTenisDisp) {
        return this.tallasTenisDisp;
    }

    public CantidadTenisDisp cantTenisDisp(CantidadTenisDisp cantidadTenisDisp) {
        return cantTenisDisp;
    }
}