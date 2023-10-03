import java.util.Date;
public class Factura extends DocTributario{
    public Factura(String numero, String rut, Date fecha,Direccion direccion){
        super(numero,rut,fecha,direccion);
    }
    @Override
    public String toString(){
        return "Informacion Factura:     numero:"+numero+" | rut:"+rut+" | fecha:"+fecha+" | direccion:"+direccion.toString();
    }
}
