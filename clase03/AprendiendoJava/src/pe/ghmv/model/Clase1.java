
package pe.ghmv.model;

public class Clase1 {
    protected final String CIUDAD="lima";
    public Clase1()
    {
        System.out.println("Hola javeros");
        System.out.println("Esaaaaaaaa gente");
    }
    public Clase1(String nombre)
    {
        System.out.println("Hola "+ nombre);
        
    }
    public int sumar(int n1,int n2)//si se aplica final a un metodo,ya no se puede sobre escribir
    {
        int value;
        value=n1+n2;
        return value;
    }
    public int restar(int n1, int n2)
    {
        return (n1-n2);
    }
}
