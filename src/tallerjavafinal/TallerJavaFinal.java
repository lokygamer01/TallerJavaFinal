/*
Apreciado aprendiz, ahora usted deberá crear el siguiente programa en Java usando todo el conocimiento que se tiene hasta el momento:

Realizar una calculadora en Java a nivel de programa de consola, donde deberá cumplir con los siguientes ítems:

La calculadora deberá soportar cualquier cantidad de números tanto positivos como negativos, incluyendo su parte decimal.
Las operaciones que debe realizar dicha calculadora son: Sumar, Restar, Multiplicar, Dividir y Módulo de la división.
Se debe validar el no poder dividir por cero ya que este tipo de operación no existe.
El código debe estar documentado.
Debe crear un vídeo donde se vea el estudiante en cámara, muestre el funcionamiento programa y explique el código que entrega, el video debe ser subido a plataforma YouTube o compartido a través de Google Drive para poderse ver en línea.
La entrega se hace en un repositorio git (Github o Gitlab) en el siguiente formulario: https://forms.gle/fqPn6ffCY3xAtEa46
 */
package tallerjavafinal;

import java.util.Scanner;
import ClassTallerJava.ClassTallerJavaFinal;


/**
 *
 * @author Camilo
 */
public class TallerJavaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //definir el numero inicial de la calculadira lineal
        ClassTallerJavaFinal  Cal=new ClassTallerJavaFinal(); 
        double num;
            System.out.println( "+ > Para Sumar\n"
                + "- > Para Restar\n"
                + "x > Para Multiplicar\n"
                + "/ > Para Dividir\n"
                + "% > Para Mod Divicion\n"
                + "!Digite los simbolos sin dejar espacios, siempre despues de digitar usar enter y despues de digitar el numero\n"
                + "volver a utilizar enter -- > USAR ENTER DESPUES DE CADA INSTRUCCION, SI NO SE HACE EL PROGRAMA NO CONTINUA\n"
                + "---------------------- > Operacion no conocida\n"
                + "t > Terminar proceso\n"
                + "----------------------\n"
                + "---------------------- > Operacion exitosa \n");
        System.out.println("Digite un numero Inicial: ");
        num=leer.nextInt();
        Cal.Calculadora(num);
        
    }
    
}
