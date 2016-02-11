package pe.ghmv.aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.List;

public class Prueba07 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Gustavo Coronel");
        lista.add("Hugo Valencia");
        lista.add("Ricardo Marcelo");
        lista.add("Marcelo Miranda");
        for  (String nombre:lista)
        {
            System.out.println(nombre);
        }
    }
}
