
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
    private int[][] resultado;
    
    public Producto(int iTam, int jTam)
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
    
    public int[][] mProducto(int[][] matriz1, int[][] matriz2)
    {
        if(matriz1.length == matriz2[0].length){
           int aux= 0;
           for(int i=0; i<matriz1.length; i++){
               for(int j=0; j<matriz2.length; j++){
                   aux=0;
                   for(int k=0; k<matriz2.length; k++){
                       aux+= matriz1[i][k] * matriz2[k][j];
                   }
                   resultado[i][j] = aux;
               }
           }
           return resultado;
        }
        return null;
    }
    
    public void print()
    {
        MostrarMatriz matriz = new MostrarMatriz();
        matriz.print(this.getResultado());
    }
}
