import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente hom = new Cliente("Homero","34.234.123-1");
        Cliente bar = new Cliente("Bartolomeo","22.432.123-3");
        Articulo manza = new Articulo(120,"manzana","una dulce manzana roja",500f);
        Articulo donn = new Articulo(200,"dona","dona glazeda con sprinkles arcoiris",1200);
        Articulo silla = new Articulo(12000,"silla","silla comodo de madera",15000f);
        Articulo pel = new Articulo(3000,"pelota", "una pelota rebotante",3500);
        Articulo tas = new Articulo(500,"tasa","tasa para el cafe",5000f);

        Direccion dir = new Direccion("Calle falsa 123");
        dir.addCliente(hom);
        dir.addCliente(bar);

        OrdenCompra orden = new OrdenCompra("en proceso",hom);
        orden.addArticulo(donn);
        orden.addArticulo(manza);

        orden.pagar(new Efectivo(10000f,new Date()));

        orden.setDocumento(new Boleta("#234",hom.getRut(),new Date()));

    }
}