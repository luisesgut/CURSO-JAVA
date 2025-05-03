public class Perro extends Animal {

    //atributos
    private String pelaje;
    private String raza;
    private String tamanio;
    // metodos
    //metodo sobre escrito (ya existe en la clase padre (Animal) y en la clase hija (Perro) la estoy sobre escribiendo apra que haga lo del perro
    @Override
    public void hacerRuido() {
        super.hacerRuido();
    }

    public void pasear () {
        System.out.println("Perro paseado");
    }

    public void jugar () {
        System.out.println("Jugar");
    }


    //constructores
    public Perro(String especie, int numPatas, String color, String pelaje, String raza, String tamanio) {
        super(especie, numPatas, color);
        this.pelaje = pelaje;
        this.raza = raza;
        this.tamanio = tamanio;
    }

    public Perro(String especie, int numPatas, String color) {
        super(especie, numPatas, color);
    }
    //Getters
    public String getPelaje() {
        return pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamanio() {
        return tamanio;
    }
    //Setters

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }




}
