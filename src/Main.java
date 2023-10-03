import java.util.*;
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Direccion dir = new Direccion("Calle Falsa 123");
        DocTributario boleta = new Boleta("+569 95241077","21.369.603-3",date);
        System.out.println(boleta);
        DocTributario factura = new Factura("+569 52130070","11.521.352-2",date);
        System.out.println(factura);
    }
}