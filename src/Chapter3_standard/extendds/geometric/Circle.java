package Chapter3_standard.extendds.geometric;

public class Circle extends GeometricFigure{
    private static final double PI = 3.14;
    public final double r;
    public Circle(){
        this.r = 1;
    }
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double getArea() {
        return MathUtils.round(PI * r * r ,2);
    }

    @Override
    public double getPerimeter() {
        return MathUtils.round(2 * PI * r ,2);
    }
}
