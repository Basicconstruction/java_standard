package chapter5_standard.practice_learn;

public class ArrayCacu {
    double avg; // 存储平均数
    int sum; // 存储和
    int max; // 存储最大值
    int min; // 存储最小值

    public int getArraySum(int score[]) {
        sum = 0;
        for (int i = 0; i < score.length; i++) { // 求和
            sum += score[i];
        }
        return sum;
    }

    public int getArrayMax(int score[]) {
        max = score[0];
        for (int i = 0; i < score.length; i++) { // 获得最大值
            if (max < score[i]) { // 比较
                max = score[i];
            }
        }
        return max;
    }

    public int getArrayMin(int score[]) {
        min = score[0];
        for (int i = 0; i < score.length; i++) { // 获得最小值
            if (min > score[i]) { // 比较
                min = score[i];
            }
        }
        return min;
    }

    public double getArrayAvg(int score[]) {
        avg = (double) (this.sum - this.max - this.min) / (double) (score.length - 2);
        return avg;
    }

    public void print(int score[]) {
        System.out.println(this.getArraySum(score));
        System.out.println(this.getArrayMax(score));
        System.out.println(this.getArrayMin(score));
        System.out.println(this.getArrayAvg(score));
    }

    public static void main(String args[]) {
        int[] score = {90, 78, 90, 96, 67, 86, 78, 92, 79, 85}; // 评委打分
        ArrayCacu ac = new ArrayCacu();
        ac.print(score);
    }
}
