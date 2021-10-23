package chapter4_standard;

public class Practice4_2 {
  /**
   * 判断一个数是不是一个素数
   * */
  public static boolean isPrime(int num) {
    if (num == 2) {
      return true;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
  /**
   * 本文件tab被认为2个空格，这是由于开发环境的格式化的结果，我并不想要
   * 额外进行替换为4空格。
   * 并非十分完备，有额外但不影响大局的空格，和额外的换行。
   * 但是与一般的解决思路兼容。
   * */
  public static void main(String[] args) {
    RootForLoop:
    for (int i = 2; i <= 100; ) {
      int[] a = new int[5];
      int p = 0;
      while (p <= 4) {
        if (isPrime(i)) {
          a[p] = i;
          p++;
        }
        if (i == 100) {
          break RootForLoop; //can be replaced by i++;break;
        }
        i++;
      }
      for (int t : a) {//standard foreach loop
        if (t != 0) {
          /*
          * int数组的元素会被默认初始化为0,很显然这并不是我们想要的结果。
          * 替代的方案是通过自定义的数组有效长度定位符p来决定输出前p个元素。
          * */
          System.out.print(t + " ");
        } else {
          break RootForLoop;
        }
      }
      System.out.println();
    }
  }
}
