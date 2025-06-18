import com.objetos.Coche;
import com.objetos.Deportivo;



public class Conductor {
    public static void main(String[] args) throws Exception {

        Coche car = new Coche();
        car.setMarca("BMW");
        car.setModelo("M3");
        car.arrancar();
        car.acelerar();
        car.acelerar();
        car.acelerar();
        car.acelerar();
        car.acelerar();
        car.acelerar();
        car.frenar();
        car.frenar();
        car.frenar();
        car.frenar(true);
        car.acelerar();
        car.arrancar();
        car.acelerar();
        System.out.println(car);


        System.out.println("\n\n");

        Deportivo car2 = new Deportivo();
        car2.setMarca("Ferrari");
        car2.setModelo("F40");
        car2.arrancar();
        car2.acelerar();
        
        System.out.println(car2);

    }    




       
}
