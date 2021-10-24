package Chapter3_standard.practice1;
/**【练习2】定义Employee类，其中包括姓名、性别、出生日期和工资，输入个人信息，并在控制台中输出。
 *代码示例：工程 EmployeeInfo*/
public class Employee {
    public String name;
    public String gender;
    public String birthDay;
    public double salary;
    public Employee(String name,String gender,String birthday,double salary){
        this.name = name;
        this.gender = gender;
        this.birthDay = birthday;
        this.salary = salary;
    }
    public Employee(GetInfomationForEmployee gife){
        this.name = gife.name;
        this.gender = gife.gender;
        this.birthDay = gife.birthDay;
        this.salary = gife.salary;
    }
    public String toString(){
        return "name: "+name+"\n"+
                "gender: "+gender+"\n"+
                "birthday: "+birthDay+"\n"+
                "salary: "+salary;
    }
    public void printInfo(){
        System.out.println(this.toString());
    }
}
