/*

Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.

*/
package ClaseAleatorio2;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class NumeroAleatorio8Actualizado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Muestra tres apuestas de la quiniela:");
        int fil = 15;
        int col = 3;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                int numApuesta = (int) (Math.random() * 6);
                String apuesta = "a";
                switch (numApuesta) {
                    case 0:
                    case 1:
                    case 2:
                        apuesta = "1";
                        break;
                    case 3:
                        apuesta = "X";
                        break;
                    case 4:
                    case 5:
                        apuesta = "2";
                        break;
                }
                System.out.print(apuesta + "  ");
            }
            System.out.println();
        }
    }

}
