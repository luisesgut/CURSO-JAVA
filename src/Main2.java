public class Main2 {
    public static void main (String[] args) {
        System.out.println("oh bb");

        Perro perro1 = new Perro ("Schnauzer", 4, "Gris", "Chuave","Schnauzer","Pequenio");
        perro1.hacerRuido();
        perro1.pasear();
        perro1.jugar();


        Ave ave1 = new Ave ("Volador",2 , "Amarillo");
        ave1.setPlumaje("Plumas suaves");
        System.out.println(ave1.getPlumaje());
        ave1.hacerRuido();
        ave1.volar();
    }
}
