package pe.ghmv.aprendiendojava.prueba;
public class Prueba04 {

    public static void main(String[] args) {
        String[] lista = new String[5]; 
        for (String cad:lista) {
            System.out.println(cad);
        }
        lista[2]="Gustavo";
        lista[3]="Claudia";
        System.out.println("---------------------");
        for(String cad:lista)
        {
            System.out.println(cad);
        }
    
    }
}
