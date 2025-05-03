public class Animal {
    // atributos
   private String especie;
   private int numPatas;
   private String color;
    // metodos
    public void hacerRuido(){
        System.out.println("Roarr");
    }

    //cosntructor
    public Animal(String especie, int numPatas, String color) {
        this.especie = especie;
        this.numPatas = numPatas;
        this.color = color;
    }

    // ejmplo sobrecarga
    public Animal(String especie, int numPatas) {
        this.especie = especie;
        this.numPatas = numPatas;

    }

    public Animal(){

    }

    public Animal(String especie) {

    }
    //getters

    public String getEspecie() {
        return especie;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public String getColor() {
        return color;
    }
   // setters
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
