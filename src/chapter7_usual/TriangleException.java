package chapter7_usual;

public class TriangleException {
    public double area(double a, double b, double c) throws IllegalDataException{
        if(a+b>c && a+c>b && b+c>a){
            double p = (a+b+c)/2;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }else
            throw new IllegalDataException("三角形数据错误");
    }
    public static void main(String[] args) {
        TriangleException ex = new TriangleException();
        try {
            double s1 = ex.area(3, 4, 5);
            System.out.println(s1);
            double s2 = ex.area(3, 4, 1);
            System.out.println(s2);
        } catch (IllegalDataException e) {
            System.out.println(e);
        }
    }
}

