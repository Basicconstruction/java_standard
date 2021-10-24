package Chapter3_standard.interfacee.vehicle;

public class Train extends Vehicle{
    public Train(String name){
        this.name = name;
    }
    public void work(){
        System.out.println(name+"这个火车可以跑");
    }
}
