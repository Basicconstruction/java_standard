package Chapter3_standard.practice1;

public class Circle {
    public static final double PI = 3.14;
    private final double r;
    public Circle(double r){
        this.r = r;
    }
    public double getArea(){
        return Circle.PI * r * r;
    }
    public double getPerimeter(){
        return 2 * Circle.PI * r;
    }
}
