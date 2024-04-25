package modelo;

public class Persona {
	//atributos
    private String nombre;
    private int edad;
    private int altura;
    private int peso;

    //constructor
    public Persona(String nombre, int edad, int altura, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    //toString
    @Override
    public String toString() {
        return "Clon{" +"nombre='" + nombre + '\'' +", edad=" + edad +
                ", altura=" + altura +", peso=" + peso +'}';
    }
}
