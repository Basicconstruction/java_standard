package Chapter3_standard.practice1;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle(12.0);
        System.out.println("面积是: "+Math.floor(c1.getArea()*100)/100);
        System.out.println("周长是: "+Math.floor(c1.getPerimeter()*100)/100);
    }
}
