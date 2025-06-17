import com.objetos.Coche;
import com.objetos.Deportivo;
import java.util.ArrayList;


public class Conductor {
    public static void main(String[] args) throws Exception {


        ArrayList<Coche> coches = new ArrayList<Coche>();

        Coche coche1 = new Coche("BMW", "M3");
        Coche coche2 = new Coche("Mercedes", "C200");
        Deportivo coche3 = new Deportivo("Ferrari", "F40");
        Deportivo coche4 = new Deportivo("Bugatti", "Veyron");

        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);

        coche1.arrancar();

        coche1.acelerar();
        coche1.acelerar();
        coche1.frenar();
        coche1.frenar();
        coche1.frenar();
        coche1.frenar();
        coche1.frenar();

        System.out.println(coche1.toString());
    }    
       
}
