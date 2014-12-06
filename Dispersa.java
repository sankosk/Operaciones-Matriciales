
/**
 * Write a description of class Dispersa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dispersa
{
    public boolean mDispersa(int[][] matriz)
    {
        int zeroCounter = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j] == 0)
                    zeroCounter+=1;
            }
        }
        
        return zeroCounter>(matriz.length/2);
    }  
}
