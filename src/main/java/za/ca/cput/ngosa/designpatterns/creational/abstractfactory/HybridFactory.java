/**
 * Created by User on 2015/03/08.
 */
public class HybridFactory implements VehicleFactory {


    @Override
    public Car getCarName(String name) {

         if(name.equals("P1"))
        {
            return new P1();
        }
        else
            return new LaFerrari();
    }
}
