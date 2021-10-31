package chapter5_standard.practice_learn;

public class Latin {
    int n;
    int data;
    int[][] arr;
    public int[][] assigin(int n){//循环赋值
        arr = new int[n][n];//放在方法之外如何？成员变量的n传不到数组下标变量中
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col < arr[row].length;col++){
                data = row + col + 1;
                if(data <= n){
                    arr[row][col] = data;
                }else{
                    arr[row][col] = data % n;
                }
            }
        }
        return arr;
    }
    public void print(int [][]arr){//输出数组的值
        for(int row = 0;row < arr.length;row++){
            for(int col = 0;col < arr[row].length;col++){
                System.out.print(arr[row][col]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Latin la=new Latin();
        int k[][]=la.assigin(4);
        la.print(k);
    }
}
