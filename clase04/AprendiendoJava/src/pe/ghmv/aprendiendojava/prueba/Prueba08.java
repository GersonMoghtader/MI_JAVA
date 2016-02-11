package pe.ghmv.aprendiendojava.prueba;

import java.util.HashMap;
import java.util.Map;

public class Prueba08 {
    public static void main(String[] args) {
        Map<String,Object> datos = new HashMap<>();
        datos.put("001","Gustavo coronel");
        datos.put("002","Claudia ramos");
        datos.put("003","Hugo Valencia");
        datos.put("004","Laura Torres");
        datos.put("005","Andrea Silva");
        for (String key : datos.keySet())
        
       {
           System.out.println(key+ "|" + datos.get(key));
       }
        System.out.println("--------------------");
        datos.put("002","karla Torres");
        for(String key: datos.keySet())
        {
            System.out.println(key +"|"+datos.get(key));
        }
        
    }
    
}
