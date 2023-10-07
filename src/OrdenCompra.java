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
    public float pagoFaltante(){
        float pagoTotal = 0f;
        for(Pago pag : pagos){
            pagoTotal += pag.getMonto();
        }
        return Math.max(calcPrecio()-pagoTotal,0);
    }
    public void addArticulo(Articulo articulo){
        orden.addArticulo(articulo);
    }
    public int quitarArticulo(Articulo articulo){
        return orden.quitarArticulo(articulo);
    }
    public void pagar(Pago pago){
        pagos.add(pago);
        pago.ordenCompra = this;
    }
    public float pagoEfectivo(Efectivo pago){
        if(pagoFaltante()==0)return pago.calcDevolucion();
        return 0f;
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
