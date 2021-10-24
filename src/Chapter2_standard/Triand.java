package Chapter2_standard;

public class Triand {
    public static int getTriand(int num){
        assert(num>=100&&num<=999);
        int res = 0;
        for(int i = 0;i < 3;i++){
            res += num % 10;
            num /= 10;
        }
        return res;

    }
    public static void main(String[] args){
        System.out.println(getTriand(123));
        System.out.println(getTriand(234));
    }
}
