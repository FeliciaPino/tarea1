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

        OrdenCompra orden1 = new OrdenCompra("en proceso",hom);
        orden1.addArticulo(donn);
        orden1.addArticulo(manza);

        float vuelto = orden1.pagoEfectivo(new Efectivo(10000f,new Date()));

        if(orden1.pagoFaltante()==0){
            orden1.setEstado("resuelta");
            orden1.setDocumento(new Boleta("#234",hom.getRut(),new Date()));
        }

        OrdenCompra orden2 = new OrdenCompra("en proceso",bar);
        orden2.addArticulo(silla);
        orden2.addArticulo(pel);
        orden2.addArticulo(tas);
        orden2.pagar(new Tarjeta(5000f, new Date(),"bci","5432"));
        if(orden2.pagoFaltante() == 0){
            orden2.setEstado("resuelta");
            orden2.setDocumento(new Factura("#234",hom.getRut(),new Date()));
        }else{
            orden2.setEstado("pendiente");
        }
        if(orden2.getEstado()=="pendiente"){
            orden2.pagar(new Transferencia(20000,new Date(), "2","#4543"));
            if(orden2.pagoFaltante()==0){
                orden2.setEstado("resuelta");
                orden2.setDocumento(new Factura("#234",hom.getRut(),new Date()));
            }
        }
        OrdenCompra orden3 = new OrdenCompra("en proceso",hom);
        for(int i=0;i<100;i++)
            orden3.addArticulo(new Articulo(200,"rosquilla","azucarada rosquilla",990));
        orden3.pagar(new Tarjeta(orden3.calcPrecio(),new Date(),"banco de chile","#325426"));
        orden3.setDocumento(new Factura("#2342",hom.getRut(),new Date()));


    }
}