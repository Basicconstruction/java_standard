package chapter5_standard.practice_pack;

import java.util.Arrays;
import java.util.Scanner;

public class Practice5_1_1 {
    public static void main(String[] args){
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int p = 0;
        while(p<=9){
            a[p++] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("mini "+a[0]);
        System.out.println("maxi "+a[9]);
        int res = 0;
        for(int i = 1;i<=10-1-1;){
            res += i++;
        }
        System.out.println("aver "+res*1.0/(10-2));

    }
}
