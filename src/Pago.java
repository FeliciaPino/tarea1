import java.util.Date;
public abstract class Pago {
    protected float monto;
    protected Date fecha;
    public OrdenCompra ordenCompra;
    public Pago(float monto, Date fecha){
        this.monto = monto;
        this.fecha = fecha;
    }

    public Date getFecha() {return fecha;}

    public float getMonto() {return monto;}
    public void setMonto(float monto){this.monto = monto;}
    public void setFecha(Date fecha){this.fecha = fecha;}
}
