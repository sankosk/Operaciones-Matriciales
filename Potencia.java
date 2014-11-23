
/**
 * Write a description of class Potencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Potencia
{
    public int[][] mPotencia(int[][] matriz, int n)
    {
        Producto producto = new Producto(matriz.length, matriz[0].length);
        for(int i=1; i<n; i++){
            matriz = producto.mProducto(matriz, matriz);
        }
        
        return matriz;
    }
}
