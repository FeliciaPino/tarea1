import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DocTributario bol = new Boleta("4312","21.456.523-2",new Date());
        System.out.println(bol);
        Articulo manza = new Articulo(120,"manzana","una dulce manzana roja",500f);
        System.out.println(manza);
    }
}