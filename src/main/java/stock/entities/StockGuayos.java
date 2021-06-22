package stock.entities;

import co.com.sofka.domain.generic.Entity;
import stock.values.CantidadGuayosDisp;
import stock.values.MarcaGuayosDisp;
import stock.values.StockGuayosId;
import stock.values.TallasGuayosDisp;

import java.util.Objects;

public class StockGuayos extends Entity <StockGuayosId> {

    private MarcaGuayosDisp marcaGuayosDisp;
    private TallasGuayosDisp tallasGuayosDisp;
    private CantidadGuayosDisp cantidadGuayosDisp;

    public StockGuayos(StockGuayosId stockGuayosId, MarcaGuayosDisp marcaGuayosDisp, TallasGuayosDisp tallasGuayosDisp, CantidadGuayosDisp cantidadGuayosDisp){
        super(stockGuayosId);
        this.marcaGuayosDisp = marcaGuayosDisp;
        this.tallasGuayosDisp = tallasGuayosDisp;
        this.cantidadGuayosDisp = cantidadGuayosDisp;
    }

    public void actualizarMarcaGuayosDisp(MarcaGuayosDisp marcaGuayosDisp){
        this.marcaGuayosDisp = Objects.requireNonNull(marcaGuayosDisp);
    }

    public void actualizarTallasGuayosDisp(TallasGuayosDisp tallasGuayosDisp){
        this.tallasGuayosDisp = Objects.requireNonNull(tallasGuayosDisp);
    }

    public void actualizarCantGuayosDisp(CantidadGuayosDisp cantidadGuayosDisp){
        this.cantidadGuayosDisp = Objects.requireNonNull(cantidadGuayosDisp);
    }

    public MarcaGuayosDisp marcaGuayosDisp() {
        return marcaGuayosDisp;
    }

    public TallasGuayosDisp tallasGuayosDisp() {
        return tallasGuayosDisp;
    }

    public CantidadGuayosDisp cantidadGuayosDisp() {
        return cantidadGuayosDisp;
    }
}