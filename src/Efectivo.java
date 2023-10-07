import java.util.Date;

public class Efectivo extends Pago{
    public Efectivo(float monto, Date fecha){super(monto,fecha);}
    public float calcDevolucion() {
        if(ordenCompra.pagoFaltante()==0){
            return monto-ordenCompra.calcPrecio();
        }
        return 0f;
    }
    @Override
    public String toString() {
        return "Efectivo{monto=\'"+monto+"\'}";
    }
}
