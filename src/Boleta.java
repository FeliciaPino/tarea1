import java.util.Date;
public class Boleta extends DocTributario{
    public Boleta(String numero, String rut, Date fecha){super(numero,rut,fecha);}
    @Override
    public String toString(){
        return "Boleta:   |numero:"+numero+" | rut:"+rut+" | fecha:"+fecha+"|";
    }
}
