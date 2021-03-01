/*
                UNIVERSIDAD AUTONOMA DE CAMPECHE
                      FACULTAD DE INGENIERIA
                     LENGUAJE DE PROGRAMACIÓN
 */
package numletra55227;
import java.util.Scanner;
/**
 *
 * @author Blanquet
 */
public class NumLetra55227 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int decena;
        int unidad;
        
        System.out.println("Ingrese su numero entre el 1 al 99");
        int numero= entrada.nextInt();
        
        decena=numero/10;
        unidad=numero%10;
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] diez = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"};
        String[] veinte ={ "veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintiocho", "veintinueve"};

        switch (decena){
            case 0: System.out.println(unidades[unidad]);
            break;
            case 1: System.out.println(diez[unidad]);
            break;
            case 2: System.out.println(veinte[unidad]);
            break;
            case 3: if (unidad == 0){
            System.out.println("treinta");
            }
            else {
            System.out.println("treinta y " + unidades[unidad]);}
            break;
            case 4:if( unidad ==0){
            System.out.println("cuarenta");
            } else {
            System.out.println ("cuarenta y "+unidades[unidad]);
            }
            break;
            case 5: if( unidad ==0){
            System.out.println("cincuenta");
            } else {
            System.out.println ("cincuenta y "+unidades[unidad]);
            }
            break; 
            case 6:if( unidad==0){ 
            System.out.println("sesenta");
            } else {
            System.out.println ("sesenta y "+unidades[unidad]);
            }
            break;
            case 7: 
            if( unidad==0){
            System.out.println("setenta");
            } else {
            System.out.println ("setenta y "+unidades[unidad]);
            }
            break;
            case 8: 
            if( unidad==0){
            System.out.println("ochenta");
            } else {
            System.out.println ("ochenta y "+unidades[unidad]);
            }
            break;
            case 9: 
            if(unidad==0){
                System.out.println("noventa");
            } else {
            System.out.println ("noventa y "+unidades[unidad]);
            }
            break;
         default:
            System.out.println ("Numero fuera de rango");
           break;
             }
        }
}
 
