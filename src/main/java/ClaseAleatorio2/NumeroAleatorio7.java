/*

Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
para los 14 partidos y el pleno al quince (15 filas).

*/
package ClaseAleatorio2;

import java.util.*;

/**
 *
 * @author SebasTati
 */
public class NumeroAleatorio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Muestra tres apuestas de la quiniela:");
        int fil = 15;
        int col = 3;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                int numApuesta = (int) (Math.random() * 3);
                String apuesta = "a";
                if (numApuesta == 0) {
                    apuesta = "X";
                } else {
                    apuesta = String.valueOf(numApuesta);
                }
                System.out.print(apuesta + "  ");
            }
            System.out.println();
        }
    }

}
