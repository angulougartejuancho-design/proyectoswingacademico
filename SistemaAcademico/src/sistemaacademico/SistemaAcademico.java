/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademico;

/**
 *
 * @author Admin
 */
public class SistemaAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Administrativo administrativo = new Administrativo(
        "Laura", 40, "Recursos Humanos", "Coordinadora"
    );
        
        System.out.println();

        System.out.println("DATOS DEL ADMINISTRATIVO");
        administrativo.mostrarDatosAdministrativo();
        administrativo.realizarGestion();
        
        System.out.println();
        Estudiante estudiante = new Estudiante(
            "María", 20, "A2024", "Ingeniería en Software"
        );

        Profesor profesor = new Profesor(
            "Carlos", 35, "Programación", 850000
        );

        System.out.println("DATOS DEL ESTUDIANTE");
        estudiante.mostrarDatosEstudiante();
        estudiante.estudiar();
        estudiante.presentarse();

        System.out.println();

        System.out.println("DATOS DEL PROFESOR");
        profesor.mostrarDatosProfesor();
        profesor.impartirClase();


    }
    
}
