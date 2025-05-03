public class Alumno {
    private String nombre;
    private int matricula;
    private String grado;


    //constructores
    public Alumno() {}

    public Alumno(String nombre, int matricula, String grado) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.grado = grado;
    }
//getters
    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getGrado() {
        return grado;
    }
//setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    //pasar a string
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", matricula=" + matricula +
                ", grado='" + grado + '\'' +
                '}';
    }
}
