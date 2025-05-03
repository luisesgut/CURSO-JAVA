import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
       ArrayList<Alumno> alumnosList = new ArrayList<>();
       Alumno alumno1 = new Alumno("Luis", 72430, "Universidad");
       Alumno alumno2 = new Alumno("Eduardo", 72431, "Posgrado");
       alumnosList.add(alumno1);
       alumnosList.add(alumno2);

        System.out.println(alumnosList.get(1).getNombre());

        for (Alumno alumno : alumnosList) {
            System.out.println(alumno.toString());
        }

    }
}
