import java.util.Date;
public class Factura extends DocTributario{
    public Factura(String numero, String rut, Date fecha){super(numero,rut,fecha);}
    @Override
    public String toString(){
        return "Factura:   |numero:"+numero+" | rut:"+rut+" | fecha:"+fecha+"|";
    }
}
