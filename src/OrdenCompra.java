import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private DetalleOrden orden;
    public OrdenCompra(String estado){
        fecha = new Date();
        this.estado = estado;
        orden = new DetalleOrden();
    }
    public float calcPrecioSinIVA(){return  orden.calcPrecioSinIVA();}
    public float calcIVA(){return orden.calcIVA();}
    public float calcPrecio(){return orden.calcPrecio();}
    public float calcPeso(){return orden.calcPeso();}
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
