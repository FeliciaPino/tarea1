import java.util.Date;

public class Tarjeta extends Pago{
    private String banco;
    private String numCuenta;
    public Tarjeta(float monto, Date fecha,String banco, String numCuenta) {
        super(monto, fecha);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    public String getBanco() {return banco;}
    public String getNumCuenta(){return numCuenta;}
    public void setBanco(String banco){this.banco = banco;}
    public void setNumCuenta(String numCuenta){this.numCuenta = numCuenta;}
}
