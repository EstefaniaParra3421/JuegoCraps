package juegoCraps;

import java.util.Random;

/**
 * Class Dado generate a Random value between 1 and 6
 * @author Leidy Estefania Parra 2042893-2711
 * @version v.1.0.0 05/12/2021
 */
public class Dado {
    private int cara;

    /**
     * Method that generate on random value to cara
     * @return number between (1,6)
     */
    public int getCara() {
        Random aleatorio = new Random();
        cara = aleatorio.nextInt(6)+1;
        return cara;
    }
}
