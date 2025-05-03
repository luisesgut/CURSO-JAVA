public class Ave extends Animal{
    // atributos
    private String tipo;
    private String plumaje;

    // metodos
    @Override
    public void hacerRuido() {
        System.out.println("pi pi pi pi pi");
    }

    public void volar (){
        System.out.println("ave volando");
    }


    // constructores
    public Ave(String especie, int numPatas, String color) {
        super(especie, numPatas, color);
    }

    public Ave(String especie, int numPatas, String color, String tipo, String plumaje) {
        super(especie, numPatas, color);
        this.tipo = tipo;
        this.plumaje = plumaje;
    }

    // getters

    public String getTipo() {
        return tipo;
    }

    public String getPlumaje() {
        return plumaje;
    }

    // setters

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }
}
