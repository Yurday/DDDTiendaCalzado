package stock;

import co.com.sofka.domain.generic.EventChange;
import stock.events.*;

public class StockChange extends EventChange {

    public StockChange(Stock stock){

        apply((StockCreado event) ->{
            stock.cantTotalStock = event.getCantTotalStock();
            stock.stockGuayos = event.getStockGuayos();
            stock.stockTenis = event.getStockTenis();
        });

        apply((CantGuayosDispStockGuayosActualizada event) -> {
            stock.stockGuayos.actualizarCantGuayosDisp(event.getCantidadGuayosDisp());
        });

        apply((CantTenisDispStockTenisActualizada event) -> {
            stock.stockTenis.cantTenisDisp(event.getCantidadTenisDisp());
        });

        apply((MarcaGuayosDispStockGuayosActualizada event) -> {
            stock.stockGuayos.actualizarMarcaGuayosDisp(event.getMarcaGuayosDisp());
        });

        apply((MarcaTenisDispStockTenisActualizada event) -> {
            stock.stockTenis.marcaTenisDisp(event.getMarcaTenisDisp());
        });

        apply((TallasGuayosDispStockGuayosActualizada event) -> {
            stock.stockGuayos.actualizarTallasGuayosDisp(event.getTallasGuayosDisp());
        });

        apply((TallasTenisDispStockTenisActualizada event) -> {
            stock.stockTenis.tallasTenisDisp(event.getTallasTenisDisp());
        });

        apply((TotalStockActualizado event) -> {
            stock.actualizarTotalStock(event.getCantTotalStock());
        });
    }
}