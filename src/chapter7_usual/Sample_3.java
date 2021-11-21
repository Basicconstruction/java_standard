package chapter7_usual;

public class Sample_3 {
    public static void myEx() throws MyException{
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            throw new MyException(e.getMessage(), e.getCause());
        }
    }
    public static void main(String[] args) {
        try{
            Sample_3.myEx();
        }catch(MyException e){
            System.out.println(e);
        }
    }
}
