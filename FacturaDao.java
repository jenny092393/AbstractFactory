import java.util.List;

public interface FacturaDao {

    public void addFactura(Factura factura);

    public void printFactura();

    public void delFactura(int nroFactura);

    public void updateFactura(int nroFactura, Factura factura);
}