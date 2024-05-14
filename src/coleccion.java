import java.util.ArrayList;
import java.util.List;

public class coleccion {
    List<DatosPersonales> listaDatos = new ArrayList<>();

    public void add(DatosPersonales dato){
        listaDatos.add(dato);
    }

    public void show(){
        for (DatosPersonales datos : listaDatos){

            System.out.println(datos);
        }
    }

    public void show2(){
        // El uso de ( -> ) se le denomina como funciones lamda
        listaDatos.forEach(dato -> System.out.println(dato));
    }

    public void buscar(String nombre){

        listaDatos.forEach(dato -> {
            if (dato.getNombre().equals(nombre)) {
                System.out.println(dato);
            }
        });
    }
}
