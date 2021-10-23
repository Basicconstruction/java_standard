package chapter4_standard;

public class Practice4_1 {
    public static void main(String[] args){
        int res = 0;
        int p = 1;
        while(res<=1000){
            res+= p++;
        }
        System.out.println(res);
    }
}
