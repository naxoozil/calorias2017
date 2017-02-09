
/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombreComida;
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String comida, int caloriasComida)
    {
        nombreComida = comida;
        calorias = caloriasComida;
    }

    public String getNombreComida()
    {
        return nombreComida;
    }
    
    public int getCalorias()
    {
        return calorias;
        
    }
}
