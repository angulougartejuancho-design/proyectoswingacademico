/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author Daryelin
 */
public class Administrativo extends Persona{
    
     private String departamento;
    private String puesto;

    // Constructor
    public Administrativo(String nombre, int edad, String departamento, String puesto) {
        super(nombre, edad);
        this.departamento = departamento;
        this.puesto = puesto;
    }

    // Método para mostrar datos
    public void mostrarDatosAdministrativo() {
        mostrarDatosGenerales();
        System.out.println("Departamento: " + departamento);
        System.out.println("Puesto: " + puesto);
    }

    // Método de acción
    public void realizarGestion() {
        System.out.println(nombre + " está realizando gestiones en el departamento de " + departamento);
    }
}
