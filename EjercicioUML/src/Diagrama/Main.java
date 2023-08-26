package Diagrama;

import Diagrama.Futbolista;
import Diagrama.Patrocinador;
import java.awt.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Patrocinador patrocinador1 = new Patrocinador();
        patrocinador1.setNombreMarca("Adidas");
        patrocinador1.setRepresentante("Juan");

        Patrocinador patrocinador2 = new Patrocinador();
        patrocinador2.setNombreMarca("Nissan");
        patrocinador2.setRepresentante("industrias LBS");

        Patrocinador patrocinador3 = new Patrocinador();
        patrocinador3.setNombreMarca("Dogo");
        patrocinador3.setRepresentante("industrias stark");

        ArrayList<Patrocinador> listapatrocinador1 = new ArrayList();
        listapatrocinador1.add(patrocinador1);

        ArrayList<Patrocinador> listapatrocinador2 = new ArrayList();
        listapatrocinador2.add(patrocinador2);

        ArrayList<Patrocinador> listapatrocinador3 = new ArrayList();
        listapatrocinador3.add(patrocinador3);

        Futbolista futbolista1 = new Futbolista();
        futbolista1.setListapatrocinador(listapatrocinador1);
        futbolista1.setNombre("juan");
        futbolista1.setNumplayera(17);

        Futbolista futbolista2 = new Futbolista();
        futbolista2.setListapatrocinador(listapatrocinador2);
        futbolista2.setNombre("diego");
        futbolista2.setNumplayera(7);

        Futbolista futbolista3 = new Futbolista();
        futbolista3.setListapatrocinador(listapatrocinador3);
        futbolista3.setNombre("Luis");
        futbolista3.setNumplayera(2);

        System.out.println(futbolista1);
        System.out.println(futbolista2);
        System.out.println(futbolista3);

    }
}
