
package pe.ghmv.model;

public class Clase2 extends Clase1{
 protected final String CIUDAD="Chiclayo";
 public Clase2()
 {
     super("juan");
 }

    @Override
    public int sumar(int n1, int n2) {
        System.out.println("ciudad Old "+CIUDAD);
        System.out.println("ciudad new "+super.CIUDAD);
        int value;
        value = (n1+n2)/(n1-n2);
        return value;
    }
public int potencia(int b,int e)
{
    int p = 1;
    for(int i =1;i <e;i++)
    {
        p *=b;
    }
    return p;
}
}
