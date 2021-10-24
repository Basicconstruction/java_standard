package Chapter3_standard.practice1;

import java.util.Scanner;

public class GetInfomationForEmployee {
    public String name;
    public String gender;
    public String birthDay;
    public double salary;
    public GetInfomationForEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("单个用户录入/输入");
        System.out.println("请输入名字");
        this.name = sc.next();
        System.out.println("请输入性别");
        this.gender = sc.next();
        System.out.println("请输入出生日期");
        this.birthDay = sc.next();
        System.out.println("请输入工资");
        this.salary = sc.nextDouble();
    }
}
