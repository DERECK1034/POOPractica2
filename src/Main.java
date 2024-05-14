public class Main {
    public static void main(String[] args) {

    /*DatosPersonales obj = new DatosPersonales("Gabriela", "Palacios Torres");
    System.out.println(obj.getNombre());*/

        coleccion objc = new coleccion();

        DatosPersonales dp1 = new DatosPersonales("Prof: Tomas", "Flores Diaz");

        objc.add(dp1);
        objc.add(new DatosPersonales("Diana Aylin", "Gonzalez Romero"));
        objc.add(new DatosPersonales("J Dereck", "Diaz Downham"));
        objc.add(new DatosPersonales("Javier Adolfo", "Sanchez Espinoza"));
        objc.add(new DatosPersonales("Erick Benjamin ", "Salmoran Aca"));

       // objc.show();
        //objc.show2();
        objc.buscar("Diana Aylin");
    }
}