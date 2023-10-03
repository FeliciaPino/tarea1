import java.util.Date;
public abstract class Pago {
    protected float monto;
    protected Date fecha;
    public OrdenCompra ordenCompra;
    public Pago(float monto, Date fecha){
        this.monto = monto;
        this.fecha = fecha;
    }
}
