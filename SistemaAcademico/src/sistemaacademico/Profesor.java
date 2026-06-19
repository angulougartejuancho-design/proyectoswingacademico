/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author Admin
 */
public class Profesor extends Persona {
    private String materia;
    private double salario;

    public Profesor(String nombre, int edad, String materia, double salario) {
        super(nombre, edad);
        this.materia = materia;
        this.salario = salario;
    }

    public void mostrarDatosProfesor() {
        mostrarDatosGenerales();
        System.out.println("Materia: " + materia);
        System.out.println("Salario: " + salario);
    }

    public void impartirClase() {
        System.out.println(nombre + " está impartiendo " + materia);
    }
}
