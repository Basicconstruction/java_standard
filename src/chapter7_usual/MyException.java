package chapter7_usual;

class MyException extends Exception{
    public MyException(){
        super();
    }
    public MyException(String msg, Throwable cause){
        super(msg, cause);
    }
}
