package Chapter3_standard.testing.wangchenxu_2024240041.T1;

public class Computer{
    public String version_info;
    public Computer(String version_info){
        this.version_info = version_info;
    }
    public String showMessage(int type){
        switch(type){
            case 1:
                return new ShowInfo1().show();
            case 2:
                return new ShowInfo2().show();
            default:
                throw new ArithmeticException("type error");
        }

    }
    /**
     * 注：接口和抽象类以及普通类都可以向上转型*/
    public String showMessage(Show show){
        return show.show();
    }
}
