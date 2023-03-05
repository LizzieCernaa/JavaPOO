package lib;

public class RecursosMultimedia {
    protected String id;
    protected String nombre;
    protected String descripcion;
    protected String ruta;

    public RecursosMultimedia(){
        this.id= "";
        this.nombre="";
        this.descripcion="";
        this.ruta="";
    }

    public RecursosMultimedia(String id, String nombre){
        this.id=id;
        this.nombre = nombre;
        this.descripcion = "";
        this.ruta = "";
    }

    public String getId(){
        return id;
    }

    public void setId(String value){
        id=value;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }


    public boolean isValid() {
        if (id.length()>0 && nombre.length()>0)
            return true;
        else
            return false;
    }


}
