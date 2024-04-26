package main;

import java.util.Comparator;
import java.util.List;
import clon.ClonadorPersona;
import modelo.Persona;

public class Start {
    public static void main(String[] args) {
    	//creamos el clonador dentro de ClonadorPersona
        ClonadorPersona clonador = new ClonadorPersona("Gonzalo");
        List<Persona> personas = clonador.clonarPersonas();
        //si el clon es valido saldra el mensaje clon valido
        System.out.println("Clones válidos:");
        //creamos el bucle para comparar los clones
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        //Ordenamos por altura y luego por peso
        personas.sort(Comparator.comparingInt(Persona::getAltura).thenComparingInt(Persona::getPeso));

        System.out.println("\nClones ordenados por altura y peso:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}