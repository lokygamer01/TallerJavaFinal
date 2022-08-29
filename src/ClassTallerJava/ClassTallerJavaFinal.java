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
package ClassTallerJava;

import java.util.Scanner;



/**
 *
 * @author Camilo
 */
public class ClassTallerJavaFinal {
    public void Calculadora(Double numInicial)
 {
     Scanner leer=new Scanner(System.in);
     //System.out.printf(" "+numInicial);
     double num = 0,total,secuencial=0;
     int i = 0;
     String operacion = null;
     while (i==0){
     operacion=leer.nextLine();
     //Suma
     
     
     if("+".equals(operacion))
     {
         //leemos el numero para hacer la suma con este numero
        num=leer.nextDouble();
        //creamos la operacion de numero inicial, por si entra primero en una suma, y luego lo sumamos al secuencia que llevamos
        total = (numInicial+secuencial)+ num;
        //una vez se use el numero inicial, lo defino en 0 para que no dañe las secuencias
        numInicial=0.0;
        //uso este pirnt para solo bajar espacios en la consola y no tener todo pegado
        System.out.println("\n\n");
        System.out.println(total);
        //defino un secuencial para llevar la cuenta de las operaciones realizadas
        secuencial=total;
        //Resta
     }else if("-".equals(operacion))
     {
         //hacemos exactamente lo mismo que en la suma, con la resta y multiplicacion
         num=leer.nextDouble();
         total = (numInicial+secuencial) - num;
         numInicial=0.0;
         System.out.println("\n\n");
        System.out.println(total);
        secuencial=total;
        //Multi
     }else if ("x".equals(operacion))
     {
         num=leer.nextDouble();
         total = (numInicial+secuencial) * num;
         numInicial=0.0;
         System.out.println("\n\n");
        System.out.println(total);
        secuencial=total;
        //div
     }else if ("/".equals(operacion))
     {
         //en la divicien, añadimos una validacion extra, pora que cuando se divida entre 0 no lo permita
         num=leer.nextDouble();
         total = (numInicial+secuencial) / num;
         if (num==0)
         {
             System.out.println("No se puede dividir por 0");
             operacion=leer.nextLine();
         }else{
         System.out.println("\n\n");
         System.out.println(total);
         secuencial=total;
         numInicial=0.0;
         }
         //MOD
     }else if ("%".equals(operacion))
     {
         //aca hacemos exactamente lo mismo que en la divicion, por si lo intentan por 0
         num=leer.nextDouble();
         total = (numInicial+secuencial) % num;
         if ((num==0 || numInicial==0))
         {
             System.out.println("No se puede dividir por 0");
             operacion=leer.nextLine();
         }
         System.out.println("\n\n");
         System.out.println(total);
         secuencial=total;
         numInicial=0.0;
     }
     //tambien si presionamos la t --> terminamos el ciclo por ende se termina el programa sin errores
     else if("t".equals(operacion))
     {
         i=1;
         System.out.println("Operaciones terminadas");
     }
     //al contrario de eso si el sistema arroja una linea ----------------------- significa que esta mal
     //pero si arroja -----------------------------
     //coble linea    -----------------------------
     // continua con normalidad
    if ( "+".equals(operacion) && "-".equals(operacion) && "x".equals(operacion) && "/".equals(operacion) && "%".equals(operacion))
    {
        System.out.println("Operacion no permitida");
    }else
    {
        System.out.println("------------------------");
    }
    
    
}
 }

   
}
