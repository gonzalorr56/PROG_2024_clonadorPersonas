package clon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import modelo.Persona;
import modelo.PersonaData;

public class ClonadorPersona {
    private String nombre;

    //Constructor de la clase ClonadorPersona
    public ClonadorPersona(String nombre) {
    	//nos quedamos el nombre aqui guardado
        this.nombre = nombre;
    }
    //Método para clonar personas
    public List<Persona> clonarPersonas() {
    	//creamos la Lista Persona que contendra personas clonadas
        ArrayList<Persona> personas = new ArrayList<Persona>();

        //bucle para crear 10 clones
        for (int i = 0; i < 10; i++) {
            try {
            	//creamos los datos randomizados (con minimo y maximo)
                Random rand = new Random();
                int edad = rand.nextInt(PersonaData.MAX_EDAD - PersonaData.MIN_EDAD + 1) + PersonaData.MIN_EDAD;
                int altura = rand.nextInt(PersonaData.MAX_ALTURA - PersonaData.MIN_ALTURA + 1) + PersonaData.MIN_ALTURA;
                int peso = rand.nextInt(PersonaData.MAX_PESO - PersonaData.MIN_PESO + 1) + PersonaData.MIN_PESO;

                //nueva instancia de Persona con valores generados del random y añadirla a la List
                personas.add(0, new Persona(nombre, edad, altura, peso));
            } catch (Exception e) {
            	//mensaje si el clon creado esta mal o no se puede crear
                System.err.println("Error al crear un Clon: " + e.getMessage());
            }
        }
        return personas;
    }
}
