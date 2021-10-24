package Chapter3_standard.extendds.geometric;

public class Triangle extends GeometricFigure{
    public final double[][] points;
    public double[] lines;
    public Triangle(){
        this.points = new double[3][2];
        points[0][0] = 0;points[0][1] = 0;
        points[1][0] = 0;points[1][1] = 0;
        points[2][0] = 0;points[2][1] = 0;
    }
    public Triangle(double[][] points) {
        this.points = points;
        validate();
    }

    private void validate(){
        /*
        *
        *      A   O   (x1,y1)
        *       0     0
        *  C 0    0     0 B (x2,y2)
        * (x3,y3)
        * */
        //A
        double x1 = points[0][0];
        double y1 = points[0][1];
        //B
        double x2 = points[1][0];
        double y2 = points[1][1];
        //C
        double x3 = points[2][0];
        double y3 = points[2][1];
        double c = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double a = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        double b = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        boolean valid = ((c+a)>b)&&((c+b)>a)&&((a+b)>c);
        if(!valid){
            throw new ArithmeticException("invalid parameter to build a triangle");
        }
        lines = new double[]{c,a,b};
    }

    @Override
    public double getArea() {
        double c = lines[0];
        double a = lines[1];
        double b = lines[2];
        double sinC = Math.sqrt(1-Math.pow((a*a+b*b-c*c)/(2*a*b),2));
        return MathUtils.round(0.5 * a * b * sinC,2);
    }

    @Override
    public double getPerimeter() {
        return MathUtils.round(lines[0]+lines[1]+lines[2],2);
    }
}
