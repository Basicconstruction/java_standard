package chapter5_standard.practice_learn;

public class CountNum {
    int m,num,index;
    public void setM(int m){
        this.m = m;
    }
    public int getM(){
        return this.m;
    }
    public int[] dic(int m) {
        int[] count = new int[10];//放到方法外作为成员变量，之下方法中的数组参数可以取消
        int n;
        while(m != 0){            //未拆分完，m为被拆分数
            n = m % 10;      //n为拆分出的个位数
            //System.out.println(""+n);
            count[n]++;   //拆分出的数字的个数加1，任意数作为数组的下标
            System.out.println(""+n+":"+count[n]);
            m /= 10;                   //去掉拆分出的数字
        }
        return count;               //数组作为返回值
    }
    public void print(int count[]){
        for(int i = 0;i<count.length;i++){
            System.out.println
                    ("count["+ i +"]"+":"+count[i]);
        }
    }
    public int getIndex(int count[]){
        index = 0; //获得最大值的下标
        for(int i = 0;i < count.length;i++){
            if(count[index] <= count[i]){
                index = i;
            }
        }
        return index;                 //下标作为返回值
    }
    public static void main(String args[]){
        CountNum cn = new CountNum();
        cn.setM(22366);
        int count[] = cn.dic(cn.getM()); /*方法的实参可以是对方法的调用*/
        cn.print(count);
        System.out.println("最大值对应的数字："+ cn.getIndex(count));
    }
}


