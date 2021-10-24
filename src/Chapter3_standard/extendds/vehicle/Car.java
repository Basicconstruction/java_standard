package Chapter3_standard.extendds.vehicle;

public class Car extends Vehicle{
    public Car(String name){
        this.name = name;
    }
    public void work(){
        System.out.println(name+"这个汽车可以跑");
    }
}
