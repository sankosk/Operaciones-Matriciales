
/**
 * Write a description of class Potencia here.
 * 
 * @author (Esteban Montes) 
 * @version (a version number or a date)
 */

public class Potencia
{
    private int[][] resultado;
    
    public int[][] getResultado()
    {
        return resultado;
    }
    
    private void setResultado(int[][] resultado)
    {
        if(resultado != null)
            this.resultado = resultado;
    }
    
    public int[][] mPotencia(int[][] matriz, int n)
    {
        Producto producto = new Producto(matriz.length, matriz[0].length);
        this.setResultado(matriz);
        for(int i=1; i<=n; i++)
            this.setResultado(producto.mProducto(matriz, this.getResultado()));
        
        return resultado;
    }
    
    public void print()
    {
        MostrarMatriz mostrarMatriz = new MostrarMatriz();
        mostrarMatriz.print(this.getResultado());
    }
}
