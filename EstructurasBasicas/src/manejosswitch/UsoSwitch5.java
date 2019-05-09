package manejosswitch;
import java.util.Scanner;
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String placa = "";
        
        
        System.out.println("Ingrese la placa del automovil");
        placa = entrada.next();
        char inicial = placa.charAt(0);
        
        switch(inicial){
            case 'G':
                System.out.printf("Placa %s con inicial %s  es de GUAYAS", 
                        placa , inicial);
                break;
            
            case 'Y':
                System.out.printf("Placa %s con inicial %s es de SANTA ELENA", 
                        placa , inicial);
                break;
                
            case 'E':
                System.out.printf("Placa %s con inicial %s es de ESMERALDAS", 
                        placa , inicial);
                break;
                
            case 'O':
                System.out.printf("Placa %s con inicial %s es de EL ORO", 
                        placa , inicial);
                break;
                
            case 'M':
                System.out.printf("Placa %s con inicial %s es de MANABÍ", 
                        placa , inicial);
                break;
            
            case 'R':
                System.out.printf("Placa %s con inicial %s es de LOS RIOS", 
                        placa , inicial);
                break;
                
            case 'J':
                System.out.printf("Placa %s con inicial %s es de SANTIAGO DE "
                        + "LOS TSACHILAS", placa , inicial);
                break;
            
            default:
                System.out.println("La placa pertenece a la REGION SIERRA");
                
        }
        
    }
}
