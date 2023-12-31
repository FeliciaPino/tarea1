import java.util.*;
public class DocTributario {
    protected String numero;
    protected String rut;
    protected Date fecha;
    protected Direccion direccion;
    protected OrdenCompra ordenCompra;
    public DocTributario(String numero, String rut, Date fecha){
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
        this.direccion = null;
    }

    public String getNumero() {return numero;}
    public String getRut(){return rut;}
    public Date getFecha(){return fecha;}
    public Direccion getDireccion(){return direccion;}
    public OrdenCompra getOrdenCompra(){return ordenCompra;}
    public void setNumero(String numero) {this.numero=numero;}
    public void setRut(String rut){this.rut = rut;}
    public void setFecha(Date fecha){this.fecha = fecha;}
    public void setDireccion(Direccion direccion){this.direccion = direccion;}
    public void setOrdenCompra(OrdenCompra ordenCompra){this.ordenCompra = ordenCompra;}
}