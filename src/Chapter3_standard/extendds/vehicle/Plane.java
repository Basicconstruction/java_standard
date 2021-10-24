package Chapter3_standard.extendds.vehicle;

public class Plane extends Vehicle{
    public Plane(String name){
        this.name = name;
    }
    public void work(){
        System.out.println(name+"这个飞机可以跑");
    }
}
