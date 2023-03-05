package lib;

public class Foto extends  RecursosMultimedia {
    private int ancho;
    private int alto;


    public Foto (){
        super();
        this.alto = 0;
        this.ancho = 0;
    }

    public Foto(String id, String nombre, int ancho, int alto){
        super(id, nombre);
        this.ancho = ancho;
        this.alto = alto;
    }



    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public boolean isFotoValida() {
        String[] aux = this.ruta.split("\\.");
        String extension = aux[1];
        if (extension.equals("png") || extension.equals("jpg") || extension.equals("bmp") || extension.equals("gif") )
            return true;
        else
            return  false;
    }



}
