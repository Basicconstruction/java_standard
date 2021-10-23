package chapter4_standard;

public class Practice4_3 {
    /**
     * 并非十分完备，有额外但不影响大局的空格，和额外的换行。
     * 但是与一般的解决思路兼容。
     * */
    public static void main(String[] args){
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
