/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
//   \    >   =    < (Simbolos necesarios....IGNORAR
/**
 *
 * @author reroes
 */
import java.util.Scanner;
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String mensajeFinal = "";
        String nombre = "Santiago David";
        String apellido = "García Jaén";
        String profesion = "Estudiante";
        int contador = 1;// Inicializacion del contador
        
        Scanner entrada = new Scanner(System.in);
        
        mensajeFinal = String.format("%s%s\n\n%s\n\n", mensajeFinal, 
                "Informe de la ciudad de Loja" ,"Listado de personas");
        
        while(contador < 5){
           // System.out.printf("Persona %d: %s %s - %s\n", contador, nombre, 
           //                   apellido, profesion);
           
            System.out.println("Ingrese sus Nombres:");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese sus Apellidos:");
            apellido = entrada.nextLine();
            
            System.out.println("Ingrese su Profesión:");
            profesion = entrada.nextLine();
            
           mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", 
                   mensajeFinal, contador, nombre, apellido, profesion);
           
            contador = contador +1;// Permite el progreso del contador para 
                                   // evitar un bucle infinito
        }
        System.out.printf("%s", mensajeFinal);
        
    }
    
}
