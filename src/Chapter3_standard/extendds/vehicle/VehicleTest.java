package Chapter3_standard.extendds.vehicle;

public class VehicleTest {
    public static void main(String[] args){
        Vehicle[] ve = new Vehicle[3];
        ve[0] = new Car("cc");
        ve[1] = new Plane("pp");
        ve[2] = new Train("tt");
        for(Vehicle vl:ve){
            vl.work();
        }
    }
}
