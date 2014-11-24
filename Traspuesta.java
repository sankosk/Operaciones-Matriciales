
/**
 * Write a description of class Traspuesta here.
 * 
 * @author (Esteban Montes) 
 * @version (a version number or a date)
 */
public class Traspuesta
{
    private int[][] resultado;
    
    public Traspuesta(int iTam, int jTam)
    {
        this.setResultado(new int[iTam][jTam]);
    }
    
    public int[][] getResultado()
    {
        return resultado;
    }
    
    private void setResultado(int[][] resultado)
    {
        if(resultado != null){
            this.resultado = resultado;
        }
    }
    
    public int[][] mTrasposicion(int[][] matriz)
    {
        for(int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz[0].length; j++)
            {
                resultado[i][j] = matriz[j][i];
            }
        }
       
        return this.getResultado();
    }
    
    public void print()
    {
        MostrarMatriz matriz = new MostrarMatriz();
        matriz.print(this.getResultado());
    }
}
