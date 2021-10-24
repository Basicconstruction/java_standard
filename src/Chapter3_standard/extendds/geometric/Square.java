package Chapter3_standard.extendds.geometric;

public class Square extends GeometricFigure{
    public final double side_length;

    public Square() {
        this.side_length = 0.0;
    }

    public Square(double side_length) {
        this.side_length = side_length;
    }

    @Override
    public double getArea() {
        return MathUtils.round(side_length*side_length,2);
    }

    @Override
    public double getPerimeter() {
        return MathUtils.round(4*side_length,2);
    }
}
