package Chapter2_standard;

public class CalCircle {
    private static final double pi = 3.14;
    private final int r;
    public CalCircle(int r){
        this.r = r;
    }
    public double getArea(){
        return pi * r * r;
    }
    public static void main(String[] args){
//        CalCircle c = new CalCircle(4);
//        System.out.println(c.getArea());
        int[] x = new int[4];
        for(int c:x){
            System.out.println(c);
        }
    }
}
