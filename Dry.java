import java.awt.Color;

/**
 * Write a description of class Dry here.
 * 
 * @author Mr. Jaffe
 * @version 2015-05-19
 */
public class Dry
{
    // array of colors for the board game
    private Color[][] array = new Color[8][8];

    /**
     * Constructor for objects of class Dry
     */
    public Dry()
    {
        // Initialize the square colors
        array[1][1] = Color.RED;
        array[1][2] = Color.RED;
        array[1][3] = Color.RED;
        array[1][4] = Color.RED;
        array[1][5] = Color.RED;
        array[1][6] = Color.RED;

        array[2][2] = Color.BLUE;
        array[2][3] = Color.BLUE;
        array[2][4] = Color.BLUE;
        array[2][5] = Color.BLUE;
        array[2][6] = Color.BLUE;
        
        array[3][0] = Color.GREEN;
        array[3][1] = Color.GREEN;
        array[3][2] = Color.GREEN;
        array[3][3] = Color.GREEN;

        array[4][3] = Color.ORANGE;
        array[4][4] = Color.ORANGE;
        array[4][5] = Color.ORANGE;
        array[4][6] = Color.ORANGE;
        array[4][7] = Color.ORANGE;
    }

}
