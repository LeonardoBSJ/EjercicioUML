
package Diagrama;
import Diagrama.Patrocinador;
import java.util.ArrayList;

public class Futbolista {
  public String nombre;
  public int numplayera;
  private ArrayList<Patrocinador> listapatrocinador;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumplayera() {
        return numplayera;
    }

    public void setNumplayera(int numplayera) {
        this.numplayera = numplayera;
    }

    public ArrayList<Patrocinador> getListapatrocinador() {
        return listapatrocinador;
    }

    public void setListapatrocinador(ArrayList<Patrocinador> listapatrocinador) {
        this.listapatrocinador = listapatrocinador;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "nombre=" + nombre + ", numplayera=" + numplayera + ", listapatrocinador=" + listapatrocinador + '}';
    }

  
}
