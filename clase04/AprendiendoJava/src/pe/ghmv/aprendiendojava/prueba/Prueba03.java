package pe.ghmv.aprendiendojava.prueba;

import java.util.Arrays;


public class Prueba03 {
    public static void main(String[] args) {
        int[] notas={18,15,6,7,12,14,16};
      
        System.out.println("Cantidad: "+Arrays.stream(notas).count());
        System.out.println("Mayor: "+Arrays.stream(notas).max());
        System.out.println("Menor: "+Arrays.stream(notas).min());
        System.out.println("Promedio: "+Arrays.stream(notas).average());
        
    }
    
}
