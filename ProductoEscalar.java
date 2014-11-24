
/**
 * Write a description of class ProductoEscalar here.
 * 
 * @author (Esteban Montes) 
 * @version (a version number or a date)
 */
public class ProductoEscalar
{
    private int[][] resultado;
    
    public ProductoEscalar(int iTam, int jTam)
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
    
    public int[][] escalarProducto(int[][] matriz1, int escalar)
    {
        for(int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[0].length; j++){
                resultado[i][j] = matriz1[i][j] * escalar;
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
