/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author Admin
 */
public class Estudiante extends Persona {
    private String carnet;
    private String carrera;

    public Estudiante(String nombre, int edad, String carnet, String carrera) {
        super(nombre, edad);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public void mostrarDatosEstudiante() {
        mostrarDatosGenerales();
        System.out.println("Carnet: " + carnet);
        System.out.println("Carrera: " + carrera);
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando " + carrera);
    }
    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estudio " + carrera);
    }
}

