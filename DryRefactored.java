import java.awt.Color;

/**
 * Write a description of class Dry here.
 * 
 * @author Mr. Jaffe
 * @version 2015-05-19
 */
public class DryRefactored
{
    // array of colors for the board game
    private Color[][] array = new Color[8][8];

    /**
     * Constructor for objects of class Dry
     */
    public DryRefactored()
    {
        // Initialize the square colors
        initRange(1, 1, 1, 6, Color.RED);
        initRange(2, 2, 2, 6, Color.BLUE);
        initRange(3, 3, 0, 3, Color.GREEN);
        initRange(4, 4, 3, 7, Color.ORANGE);
    }
    
    public void initRange(int startX, int endX, int startY, int endY, Color color) {   
        for (int i=startX; i<=endX; i++) 
            for (int j=startY; j<=endY; j++)
                array[i][j] = color;
    }

}

