
/**
 * Write a description of class MostrarMatriz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MostrarMatriz
{
    public void print(int[][] matriz)
    {
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(""+matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    } 
}
