import java.util.ArrayList;
public class DetalleOrden {
    private int cantidad;
    ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public DetalleOrden(){
        cantidad = 0;
    }
    public float calcPrecioSinIVA(){
        float precio = 0f;
        for(Articulo a : articulos){
            precio += a.getPrecio();
        }
        return precio;
    }
    public float calcIVA(){
        return 1.21f;
    }
    public float calcPrecio(){
        return calcPrecioSinIVA()*calcIVA();
    }
    public float calcPeso(){
        float peso = 0f;
        for(Articulo a : articulos){
            peso += a.getPeso();
        }
        return peso;
    }
    public void addArticulo(Articulo articulo){
        articulos.add(articulo);
        cantidad++;
    }
    public int quitarArticulo(Articulo articulo){
        try {
            articulos.remove(articulo);
            return 0;
        }catch (Exception e){
            return -1;
        }
    }

    public int getCantidad() {return cantidad;}

    @Override
    public String toString() {
        return "DetalleOrden{" +
                "cantidad=" + cantidad +
                ", articulos=" + articulos +
                '}';
    }
}
