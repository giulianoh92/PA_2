package Bombilla;

public class Bombilla {
    private boolean estado = false;
    
    Bombilla(boolean estado){
        this.estado = estado;
    }

    public void encender() {
        estado = true;
    }

    public void apagar() {
        estado = false;
    }

    public void cambiar() {
        estado = !estado;
    }

    public void imprimirEstado() {
        System.out.println(estado);
    }
}
