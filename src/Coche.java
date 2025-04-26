//se inicializa la clase
public class Coche {
    //atributos
    private String marca;
    private String modelo;
    private int anio;
    private double kilometrajeRecorrido;

    //constructor
    public Coche(String marca, String modelo, int anio, double kilometrajeRecorrido) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometrajeRecorrido = kilometrajeRecorrido;
    }
    //Constructor
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

    }
//constructor
    public Coche() {

    }


    //Metodos del objeto
    public void arrancar(){
        System.out.println("Arrancando...");
    }

    public String apagar(){
        System.out.println("Apagando...");
        String apagado = "Apagado";
        return "Apagado";
    }

    //getters y setters
    //getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getKilometrajeRecorrido() {
        return kilometrajeRecorrido;
    }

    //setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometrajeRecorrido(double kilometrajeRecorrido) {
        this.kilometrajeRecorrido = kilometrajeRecorrido;
    }
}
