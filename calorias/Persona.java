
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    //guarda el nombre de la persona
    private String nombre;
    //guarda el sexo de la persona true si es hombre y false si es mujer
    private boolean sexo;
    //guarda el peso de la persona
    private int peso;
    //guarda la altura de la persona
    private int altura;
    //guarda la edad de la persona
    private int edad;
    //guarda las calorias ingeridas por la persona. 
    //sera -1 en cuanto supere el numero de su metabolismo basal
    private int caloriasIngeridas;
    //guarda el metabolismo basal de la persona sera distinto si es hombre o mujer
    private int metabasal;

    /**
     * Constructor for objects of class Persona
     * El sexo es hombre si es true y mujer si es false
     * 
     */
    public Persona(String nombre, boolean sexo, int peso, int altura, int edad)
    {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        caloriasIngeridas = 0;
        if (sexo){
            metabasal = (10*peso) + (6*altura) + (5*edad) + 5;
        }
        else{
            metabasal = (10*peso) + (6*altura) + (5*edad) - 161;
        }
    }

    /**
     * 
     */
    public int comer(Comida alimento)
    {
       int caloriasConsumidas = -1;
       if(caloriasIngeridas <= metabasal){
           caloriasConsumidas = alimento.getCalorias();
           caloriasIngeridas = caloriasIngeridas + alimento.getCalorias();
       }
       return caloriasConsumidas;
 
    }
    
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    
    public String contestar(String pregunta)
    {
        String respuesta = "";
        if(caloriasIngeridas > metabasal){
            respuesta = pregunta.toUpperCase();

        }
        else{
            if(pregunta.length() % 3 == 0 ){
                respuesta = "SI";
            }
            else{
                respuesta = "NO";
            }
        }
        
         if(pregunta.contains(nombre)){
            respuesta = pregunta.toUpperCase();
        }
        System.out.println(respuesta);
        return respuesta;
    }   
}
        
        
        
        

