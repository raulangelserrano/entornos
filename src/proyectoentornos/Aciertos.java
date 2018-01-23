package proyectoentornos;

import java.util.Scanner;

/**
 * clase Aciertos para tarea de entornos de desarrollo
 * Trata de adivinar el número que genera de manera aleatoria el programa
 * @author: Raul Serrano
 * @version: 23/01/2018
 * 
 */
public class Aciertos {
	
	/**
	 * Contructor de la clase no utiliza parametros
	 * @param args
	 */

    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
    /**
     * La clase no devuelve valores
     * @return
     */
    
}