package lib;

public class Audio extends RecursosMultimedia {
    private int duracionSegundos;

    public Audio(){
        super();
        duracionSegundos = 0;
    }

    public Audio(String id, String nombre, int duracionSegundos){
        super(id,nombre);
        this.duracionSegundos = duracionSegundos;
    }


    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public boolean isAudioValido() {
        String[] aux = this.ruta.split(".");
        String extension = aux[1];
        if (extension.equals("mp3") || extension.equals("wav") )
            return true;
        else
            return  false;
    }

}
