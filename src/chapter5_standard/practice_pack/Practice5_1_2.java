package chapter5_standard.practice_pack;

public class Practice5_1_2 {
    public static void main(String[] args){
        String s = "ABCDEFG";
        s = s.substring(0,2)+s.substring(4);
        System.out.println(s);
        s = s.substring(0,1)+s.substring(2);
        System.out.println(s);
        s = s.substring(0,s.length()-2)+s.substring(s.length()-1);
        System.out.println(s);

    }
}
