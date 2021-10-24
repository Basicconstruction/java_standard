package Chapter3_standard.practice1;

public class EmployeeTest {
    public static void main(String[] args){
        GetInfomationForEmployee gife = new GetInfomationForEmployee();
        Employee ee = new Employee(gife);
        ee.printInfo();
    }
}
