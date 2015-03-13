/**
 * Created by User on 2015/03/08.
 */
public class SedanFactory implements  VehicleFactory {
    @Override
    public Car getCarName(String categ) {
        if("M3".equals(categ))
        {
            return new M3();
        }
        else
            return new ISF();
    }
}
