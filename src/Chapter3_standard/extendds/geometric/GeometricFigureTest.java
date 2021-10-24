package Chapter3_standard.extendds.geometric;

public class GeometricFigureTest {
    public static double getArea(GeometricFigure gf){
        return gf.getArea();
    }
    public static double getPerimeter(GeometricFigure gf){
        return gf.getPerimeter();
    }
    public static void main(String[] args){
        GeometricFigure c1 = new Circle(4);
        GeometricFigure s1 = new Square(4);
        GeometricFigure t1 = new Triangle(new double[][]{{0,0},{1,0},{0,1}});
        System.out.println(getArea(c1));
        System.out.println(getArea(s1));
        System.out.println(getArea(t1));
        System.out.println(getPerimeter(c1));
        System.out.println(getPerimeter(s1));
        System.out.println(getPerimeter(t1));
    }
}
