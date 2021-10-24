package Chapter3_standard.extendds.geometric;

public class MathUtils {
    public static double round(double v,int scale){
        return Math.round(v*Math.pow(10,scale))*1.0/Math.pow(10,scale);
    }
}
