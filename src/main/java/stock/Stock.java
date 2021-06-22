package stock;

import bodega.values.BodegaId;
import co.com.sofka.domain.generic.AggregateEvent;
import stock.entities.StockGuayos;
import stock.entities.StockTenis;
import stock.events.*;
import stock.values.*;

public class Stock extends AggregateEvent <StockId> {
    protected CantTotalStock cantTotalStock;
    protected BodegaId bodegaId;
    protected StockGuayos stockGuayos;
    protected StockTenis stockTenis;

    public Stock(StockId stockId, CantTotalStock cantTotalStock, StockGuayos stockGuayos, StockTenis stockTenis){
        super(stockId);
        appendChange(new StockCreado(stockId, cantTotalStock, stockGuayos, stockTenis)).apply();
    }

    private Stock(StockId stockId){
        super(stockId);
        subscribe(new StockChange(this));
    }

    //Commands

    public void actualizarCantGuayosDispStockGuayos(CantidadGuayosDisp cantidadGuayosDisp) {
        appendChange(new CantGuayosDispStockGuayosActualizada(cantidadGuayosDisp)).apply();
    }

    public void actualizarCantTenisDispStockTenis(CantidadTenisDisp cantidadTenisDisp) {
        appendChange(new CantTenisDispStockTenisActualizada(cantidadTenisDisp)).apply();
    }

    public void actualizarMarcaGuayosDispStockGuayos(MarcaGuayosDisp marcaGuayosDisp) {
        appendChange(new MarcaGuayosDispStockGuayosActualizada(marcaGuayosDisp)).apply();
    }

    public void actualizarMarcaTenisDispStockTenis(MarcaTenisDisp marcaTenisDisp) {
        appendChange(new MarcaTenisDispStockTenisActualizada(marcaTenisDisp)).apply();
    }

    public void actualizarTallasGuayosDispStockGuayos(TallasGuayosDisp tallasGuayosDisp) {
        appendChange(new TallasGuayosDispStockGuayosActualizada(tallasGuayosDisp)).apply();
    }

    public void actualizarTallasTenisDispStockTenis(TallasTenisDisp tallasTenisDisp) {
        appendChange(new TallasTenisDispStockTenisActualizada(tallasTenisDisp)).apply();
    }

    public void actualizarTotalStock(CantTotalStock cantTotalStock) {
        appendChange(new TotalStockActualizado(cantTotalStock)).apply();
    }
}
