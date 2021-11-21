package chapter7_usual;

class IllegalDataException extends Exception{
    public IllegalDataException(){
        super("数据无效");
    }
    public IllegalDataException(String s){
        super(s);
    }
}
