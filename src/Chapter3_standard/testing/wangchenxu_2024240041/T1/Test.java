package Chapter3_standard.testing.wangchenxu_2024240041.T1;

public class Test {
    public static void main(String[] args){
        Human[] hs = {new Man("lili"),new Woman("kl")};
        OperateWay[] op = {new OperateWay1(),new OperateWay2()};
        Computer[] cm = {new NoteBookPC("er12"),new PadPC("fr_124")};
        Show[] ss = {new ShowInfo1(),new ShowInfo2()};
        for(Human human:hs){
            for(OperateWay operateWay:op){
                for(Computer computer:cm){
//                    human.operate(operateWay,computer,1);
//                    human.operate(operateWay,computer,2);
                    for(Show show:ss){
                        human.operate(operateWay,computer,show);
                    }
                }
            }
        }
    }
}
