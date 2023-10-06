import java.util.Date;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class Transferencia extends Pago{
    private String tipo;
    private String numTransaccion;
    public Transferencia(float monto, Date fecha, String tipo, String numTransaccion){
        super(monto,fecha);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public String getTipo(){return tipo;}
    public String getNumTransaccion(){return numTransaccion;}
    public void setTipo(String tipo){this.tipo =tipo;}
    public void setNumTransaccion(String numTransaccion){this.numTransaccion = numTransaccion;}

    @Override
    public String toString() {
        return "Transferencia{" +
                "tipo='" + tipo + '\'' +
                ", numTransaccion='" + numTransaccion + '\'' +
                ", monto=" + monto +
                '}';
    }
}
