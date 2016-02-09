
package pe.ghmv.app.model;


public class Producto {
    private String nombre;
    private int stock;
    private double precio;
    private boolean activo;

    
    
    public Producto() {//constructor por defecto, se utiliza para inicializar el objeto.No tiene parametros,si una clase no tiene ningun constructor java le agrega el constructor
        //por defecto
        this.nombre="Curso de java";
        this.precio=300.0;
        this.stock=20;
        this.activo=true;
        System.out.println("Objeto creado");
    }
    //encapsulamiento de las variables

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); 
        System.err.println("Chau objeto");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {//cuando es boolean en lugar de get utiliza is
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
