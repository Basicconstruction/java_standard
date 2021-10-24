package Chapter2_standard;

public class Year {
    public final int year;
    public Year(int year){
        this.year = year;
    }
    public static boolean isLeap(int year){
        if(year%400==0){
            return true;
        }else{
            return year % 4 == 0 && year % 100 != 0;
        }
    }
    public static void main(String[] args){
        Year[] years = new Year[]{new Year(2020),new Year(2100)};
        for(Year year1:years){
            if(Year.isLeap(year1.year)){
                System.out.println(year1.year+" is leap year");
            }else{
                System.out.println(year1.year+" is not leap year");
            }
        }
    }
}
