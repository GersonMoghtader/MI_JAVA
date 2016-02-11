package pe.ghmv.aprendiendojava.prueba;

import java.util.Arrays;

public class Prueba2 {
    public static void main(String[] args) {
        int notas[];
        notas= new int[5];
        //recorrido indexado
        for (int i = 0; i < notas.length; i++) {
            int nota =notas[i];
            System.out.println(nota);
        }
        System.out.println("--------------");
        notas[3]=600;
        //recorrido tipo coleccion
           for (int nota:notas) {
               System.out.println(nota);
        }
        System.out.println("--------------");
        notas[1]=notas[3]/3;
        //recorrido usando lambda
        Arrays.stream(notas).forEach(n -> System.out.println(n));
        System.out.println("--------------");
    }
    
}
