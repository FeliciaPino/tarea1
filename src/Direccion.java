import java.util.ArrayList;
public class Direccion {
    private String direccion;
    private ArrayList<Cliente> clientes;
    private ArrayList<DocTributario> documentos;
    public Direccion(String direccion){
        this.direccion = direccion;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void addDocumento(DocTributario documento){
        documentos.add(documento);
    }
    public int removeCliente(Cliente cliente){
        try{
            clientes.remove(cliente);
            return 0;
        }catch (Exception e){
            return -1;
        }
    }
    public int removeDocumento(DocTributario documento){
        try{
            documentos.remove(documento);
            return 0;
        }catch (Exception e){
            return -1;
        }
    }

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    @Override
    public String toString(){
        return direccion;
    }
}
