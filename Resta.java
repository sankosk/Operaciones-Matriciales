
/**
 * Write a description of class Resta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resta
{
    private int[][] resultado;
    
    public Resta(int iTam, int jTam)
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
    
    public int[][] mResta(int[][] matriz1, int[][] matriz2)
    {
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[0].length; j++){
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
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
