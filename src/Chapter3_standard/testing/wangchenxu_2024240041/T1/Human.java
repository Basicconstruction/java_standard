package Chapter3_standard.testing.wangchenxu_2024240041.T1;

public class Human {
    public String name;
    public Human(String name){
        this.name = name;
    }
    public void operate(OperateWay op,Computer pc,int type){
        System.out.println(this.name+op.operate()+pc.version_info+"屏幕显示----->"+pc.showMessage(type));
    }
    /**
     * 注：接口和抽象类以及普通类都可以向上转型
     * 在这里向上转型了接口OperateWay,Show普通类转性了computer*/
    public void operate(OperateWay op,Computer pc,Show show){
        System.out.println(this.name+op.operate()+pc.version_info+"屏幕显示----->"+pc.showMessage(show));
    }
}
