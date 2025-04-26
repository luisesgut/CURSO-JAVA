public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Coche coche1 = new Coche(); // instanciar el primer objeto tipo coche
        coche1.setAnio(2020);
        System.out.println(coche1.getAnio());
        coche1.setKilometrajeRecorrido(1);
        System.out.println(coche1.getKilometrajeRecorrido());
        coche1.setMarca("Tesla");
        System.out.println(coche1.getMarca());
        coche1.setModelo("Cybertruck");
        System.out.println(coche1.getModelo());

        Coche coche2 = new Coche("Toyota", "Prius",20,10.0);
        System.out.println(coche2.getAnio());
        System.out.println(coche2.getKilometrajeRecorrido());
        System.out.println(coche2.getMarca());
        coche2.setMarca("Tesla");
        System.out.println(coche2.getMarca());
        System.out.println(coche2.getModelo());

        coche2.arrancar();

    }
}
