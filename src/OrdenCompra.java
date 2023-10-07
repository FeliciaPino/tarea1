import javax.print.Doc;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.*;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private DetalleOrden orden;
    private ArrayList<Pago> pagos;
    private DocTributario documento;
    private Cliente cliente;
    public OrdenCompra(String estado, Cliente cliente){
        fecha = new Date();
        this.estado = estado;
        this.cliente = cliente;
        orden = new DetalleOrden();
    }
    public float calcPrecioSinIVA(){
        return orden.calcPrecioSinIVA();
    }
    public float calcIVA(){
        return orden.calcIVA();
    }
    public float calcPrecio(){
        return orden.calcPrecio();
    }
    public float calcPeso(){
        return orden.calcPeso();
    }
    public void addArticulo(Articulo articulo){
        orden.addArticulo(articulo);
    }
    public int quitarArticulo(Articulo articulo){
        return orden.quitarArticulo(articulo);
    }
    public void pagar(Pago pago){
        pagos.add(pago);
    }
    public void setDocumento(DocTributario doc){
        this.documento = doc;
    }
    public Date getFecha(){return fecha;}
    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado = estado;}

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "fecha=" + fecha +
                ", estado='" + estado + '\'' +
                '}';
    }
}
